public class InsertANodeAtMiddleOfLinkedList {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            Node next = null;
        }
    }

    static void insertAtMiddle(int data){
        if (head==null){
            head = new Node(data);
        }

        else {
            Node newNode = new Node(data);

            Node slow = head;
            Node fast = head.next;

            while (fast!=null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            newNode.next = slow.next;
            slow.next = newNode;
        }
    }

}
