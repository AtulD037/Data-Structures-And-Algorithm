package LinkedList;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if (head==null){
            head = tail = node;
            return;
        }
        tail.next = node;
        node.next=head;
        tail=node;
    }

    public void display(){
        Node node = head;
        if (head!=null){
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            }while (node!=head);
        }
        System.out.println("Head");
    }

    public void delete(int val){
        Node node = head;
        if (node==null){
            return;
        }
        if (node.value == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.value==val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node!=head);
    }

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insert(23);
        circularLinkedList.insert(24);
        circularLinkedList.insert(25);
        circularLinkedList.insert(26);
        circularLinkedList.display();
    }
}
