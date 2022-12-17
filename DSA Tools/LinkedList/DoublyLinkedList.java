package LinkedList;

public class DoublyLinkedList {
    private Node head; // Default head which is equal to null

    private class Node{
        int value;
        Node next;
        Node prev;

        // Constructor 1
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
        // Constructor 2
        public Node(int value){
            this.value = value;
        }

    }

    // Insert element at first position of the linked list
    public void insertFirst(int value){
        Node node = new Node(value); // Make a new node with some value in it
        node.next = head;           // now node will point forward towards old head
        node.prev = null;           // and previous pointer of new node will point towards null
        if (head!=null){            // If head is not equal to null -
            head.prev = node;       // Then point the previous pointer of head towards new node created
        }
        head = node;                // Make head to new node
    }
    // Method for printing the linked list
    public void display(){
        Node node = head;           //
        Node last = null;
        while (node!=null){
            System.out.print(node.value+" -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");
        System.out.println("Print in reverse\n");
        while (last!=null){
            System.out.print(last.value+" -> ");
            last= last.prev;
        }
        System.out.println("Start");

    }
    // Method for inserting element at the last
    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;

        node.next = null;

        if (head==null){
            node.prev = null;
            head = node;
            return;
        }
        while (last.next!=null){
            last = last.next;
        }
        last.next = node;
        last.prev = last;
    }
    // Find reference to node
    public Node find(int value){
        Node node = head;
        while (node!=null){
            if (node.value==value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    // Method for inserting element at a particular index
    public void insert(int val,int index){
        Node p = find(index);
        if (p==null){
            System.out.println("Does not exist");
            return;
        }
        Node node = new Node(val);
    }



    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(3);
        doublyLinkedList.insertFirst(4);
        doublyLinkedList.insertFirst(5);
        doublyLinkedList.insertLast(7);

        doublyLinkedList.display();



    }
}
