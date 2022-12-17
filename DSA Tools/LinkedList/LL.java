package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value =value;
            this.next = next;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if (tail==null){
            tail=head;
        }
        node.next=head;
        head=node;
        size++;
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public static LL merge(LL first,LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();
        while (f!=null && s!=null){
            if (f.value<s.value){
                ans.insert(f.value);
                f = f.next;
            }
            else {
                ans.insert(s.value);
                s = s.next;
            }
        }
        while (f!=null){
            ans.insert(f.value);
            f = f.next;
        }
        while (s!=null){
            ans.insert(s.value);
            s = s.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        LL list1 = new LL();
        LL list2 = new LL();

        list1.insert(5);
        list1.insert(3);
        list1.insert(1);

        list1.display();
        list2.insert(14);
        list2.insert(9);
        list2.insert(2);
        list2.insert(1);

        list2.display();

        LL ans = LL.merge(list1,list2);

        ans.display();

    }
}
