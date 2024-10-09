public class queueSamle {
    class Node {
        int data;
        Node next;


        public Node(int data){
            this.data = data;
        } 
    }
    public Node front;
    public Node rear;

    void enqueue(int data){
        Node newNode=new Node(data);
        if (rear == null) {
            front = rear = newNode;

            
        }
        rear.next = newNode;
        rear = newNode;
    }

    void dequeue(){
        if (front == null) {
            System.out.println("empty queue");
            
        }
        front = front.next;

        if (front == null) {
            rear = null;
            
        }
    }


    public void display(){
        if (front == null) {
            System.out.println("empty !!!!!");
            return;
        } 
        Node temp =  front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            
            temp =  temp.next;
        }
    }

    public static void main(String[] args) {

        queueSamle queue = new queueSamle();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);

        queue.display();


    System.out.println("\nValues after dequeue");        

        queue.dequeue();
        queue.display();

        
    }

  













}
