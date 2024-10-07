public class LinkDelete {
    class Node{                                          
        int data;
        Node next;
        Node(int data){
            this.data = data;



        }
    }
    public Node head = null ;
    public Node tail = null;

    public void addnode(int data){
        Node newNode=new Node(data);

        if (head == null) {

            head = newNode;
            
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }
    public void display(){
        if (head == null) {
            System.out.println("empty");
            return;
            
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);

            temp = temp.next;
            
        }

       
    }
    public void delete(int data){

        Node temp = head,prev = null;
        if (temp != null && temp.data == data) {           //delete for head
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;                           //delete for center 
        }
        if (temp == null) {
            return;
            
        }
        if (temp == tail) {
            tail = prev;
            tail.next = null;                       //tail

            return;

            
        }
        prev.next = temp.next;

    }


    public static void main(String[] args) {
        LinkDelete list = new LinkDelete();

        list.display();

        list.addnode(30);
        list.addnode(50);
        list.addnode(20);

        list.display();

        list.delete(50);
        list.display();
    }















}
