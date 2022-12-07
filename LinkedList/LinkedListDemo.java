
public class LinkedListDemo {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    // Methods - add, remove,print
    public void addFirst(int data){
        // - Step 1 (Create new node)
        Node newNode = new Node(data);
        if (head==null){
            head=tail=newNode;
            return;
        }
         // - Step 2 (new node next = head)
        newNode.next =head;
        // - Step 3 (head = new node)
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head=tail=newNode;
        }
        tail.next = newNode;
        tail=newNode;
    }

    public void print(){
        Node temp =head;
        System.out.println(temp.data);
    }


    public static void main(String[] args) {

        LinkedListDemo ll = new LinkedListDemo();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);




    }
}
