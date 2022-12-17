package LinkedList;

public class LLRemoveDuplicatesFromSortedList {

    private Node head;
    private Node tail;
    private int size;

    LLRemoveDuplicatesFromSortedList(){
        this.size = 0;
    }
    public class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    // insert elements
    public void append(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail==null){
            tail = head;
        }
        size++;
    }

    // display elements
    public void display(){
        Node node = head;
        while (node!=null){
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.println("End");
    }

    // Public void duplicates removal
    public void removeDuplicates(){
        Node node = head;
        while (node.next!=null){
            if (node.val==node.next.val){
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    public static void main(String[] args) {
        LLRemoveDuplicatesFromSortedList ll = new LLRemoveDuplicatesFromSortedList();
        ll.append(5);
        ll.append(5);
        ll.append(5);
        ll.append(4);
        ll.append(4);
        ll.append(4);
        ll.append(3);
        ll.append(2);
        ll.append(1);
        ll.append(1);
        ll.append(1);
        ll.append(1);
        ll.display();

        ll.removeDuplicates();
        ll.display();
    }
}
