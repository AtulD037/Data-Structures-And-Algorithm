public class InsertANodeAtBeginningOfLinkedList {

    class Node{
        int data;
        Node nextNode;

        public Node(int data){
            this.data = data;
            this.nextNode= null;
        }

        public Node head = null;
        public Node tail = null;

        public void addAtStart(int data){
            Node newNode = new Node(data);
            if (head==null){
                head=tail=newNode;
            }
            else {
                Node temp = head;
                head = newNode;
                head.nextNode = temp;
            }
        }

        }

    }

