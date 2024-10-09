public class DuplicateLink {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;

        }

    }
    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;

            
        }else{
            tail.next = newNode;
            
        }
        tail = newNode; 
    }
    public void display(){
        if (head == null) {
            System.out.println("Empty !!!");
            return;
            
        }

        Node temp = head;
        while (temp !=  null) {
            System.out.println(temp.data);
            temp = temp.next;

            
        }

    }
    public void removeDuplicate(){
        Node current = head;

        while (current != null){
            Node another = current.next;
            while (another != null && another.data == current.data) {
                another = another.next;

                
            }
            current.next = another;

            if (another == tail && current.data == another.data) {
                tail = current;
                tail.next = null;
                
            }
            current = another;


        }


    }

    public static void main(String[] args) {
        DuplicateLink  list = new DuplicateLink();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(30);
        list.addNode(30);
        list.addNode(60);
        list.addNode(80);
        list.addNode(80);
        list.addNode(80);
        list.addNode(90);
       

        list.display();

        System.out.println("Values after Removing Duplicate");

        list.removeDuplicate();
        list.display();

    }












}
