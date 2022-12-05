public class CallByReference {
    int data;

    void change(CallByReference op){
        op.data = op.data+100;
    }

    public static void main(String[] args) {
        CallByReference op = new CallByReference();
        op.data = 500;
        System.out.println("Before Change "+op.data);

        op.change(op);

        System.out.println("After Change "+op.data);
    }
}
