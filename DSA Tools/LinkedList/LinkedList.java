package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public class Node {
        private int value;
        private Node next;

        // Constructor one
        public Node(int value){
            this.value = value;
        }
        // Constructor two
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    // Insert at first Position
    public void insertFirst(int val){
        Node node = new Node(val); // Create a node
        node.next = head;          // Created node's pointer will now points towards the old head
        head = node;               // Now make the head as node
        if (tail==null){         // if tail is null or no tail is there make tail and head same
            tail =head;
        }
        size++;               // Increase the size by one
    }

    // Insert at last position
    public void insertLast(int val){
        Node node = new Node(val); // Create a node object
        if (tail==null){   // If tail is null
            insertFirst(val); // Insert an element
            return; // return from here only
        }
        tail.next = node; // old tail's pointer now points towards next node
        tail = node; // now make the new node as tail
        size++; // Increase the size by one
    }

    // Insert at a specific index
    public void insert(int val,int index){
        if (index==0){ // If we have to insert at index 0 use insert at first and return
            insertFirst(val);
            return;
        }
        if (index==size-1){ // If we have to insert the element at last use insert at last and return form here
            insertLast(val);
        }
        // Otherwise, create a node temp which is initially equals to head
        // and now start moving the pointer by one till we reach index value
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp =temp.next;
        }
        Node node = new Node(val,temp.next);
        // And now make the pointer of our node towards next value
        temp.next = node;
        size++;
    }

    // Display the list
    public void display(){
        Node temp = head; // Take a temporary pointer which is initially equals to head
        while (temp!=null){ // and now apply condition until which temp is not equals to null
            System.out.print(temp.value+" -> "); // print each nodes value
            temp =temp.next; // increase the pointer by one
        }
        System.out.println("End");
    }

    // Delete at starting position
    public int deleteFirst(){
        int val = head.value; // For returning the value of First node store value in an integer
        head = head.next; // Make the head as next head (detaching)
        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }

    //get Node at particular index
    public Node get(int index){
        Node node = head; // Make a node which is initially equals to head
        for (int i = 0; i < index; i++) { // Iterate till index
            node = node.next; // At every iteration move pointer ahead
        }
        return node; // Return the node
    }

    // Delete the last item
    public int deleteLast(){
        if (size<=1){ // if size == 1 or less use delete first
            return deleteFirst();
        }
        Node secondLast = get(size-2); // Node second-last will be returned by the above get function
        int val = tail.value; // Store value of tail in a variable
        tail = secondLast; // now make tail as second last node
        tail.next = null; // now this updated last not will point towards null
        return val;       // return the stored value of the last node before deletion
    }

    // Delete at particular index
    public int delete(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1); // Take node less than that particular index

        int val = prev.next.value; // Store its value in a variable

        prev.next = prev.next.next; // now point this node toward next-> next node
        return val;

    }

    // finding the node that has this value
    public Node find(int value){
        Node node = head; // Take a temporary node which is initially equals to head
        while (node!=null){ // Loop till node traverse the last element
            if (node.value==value){ // whenever find value return that node
                return node;
            }
            node = node.next; // increment the node towards right
        }
        return null; // if value is not present return null
    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(5);
        linkedList.insertFirst(4);
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);

        linkedList.display();

        linkedList.insertLast(6);
        linkedList.insertLast(7);
        linkedList.insertLast(8);
        linkedList.insertLast(9);

        linkedList.display();

        linkedList.insert(0,0);
        linkedList.display();

        linkedList.insert(111,4);
        linkedList.display();

        linkedList.deleteFirst();
        linkedList.display();

        System.out.println(linkedList.size);
        linkedList.deleteLast();
        System.out.println(linkedList.size);
        linkedList.display();
        System.out.println(linkedList.size);

        linkedList.delete(5);
        linkedList.display();

    }
}
