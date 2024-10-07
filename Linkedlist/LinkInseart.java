public class LinkInseart {
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
            System.out.println("null");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
            
        }


    }
    public void inseartafter(int nextTo, int data){
        Node newnNode = new Node(data);
        Node temp = head;


        while (temp != null && temp.data != nextTo) {
            temp = temp.next;
            
        }
        if (temp == null) {
            return;

            
        }
        if (temp == tail) {
            tail.next = newnNode;
            tail = newnNode;

            
        }
        newnNode.next = temp.next;
        temp.next = newnNode;  
    }


    public static void main(String[] args) {
        LinkInseart link = new LinkInseart();
        // link.display();

        link.addNode(10);
        link.addNode(20);
        link.addNode(30);
        link.addNode(50);

        link.inseartafter(30, 40);

        link.display();
    }    
}
