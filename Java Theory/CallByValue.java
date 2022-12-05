public class CallByValue {

    int data = 50;

    void change(int data){
        data = data+100;
    }

    public static void main(String[] args) {
        CallByValue callByValue = new CallByValue();
        System.out.println("Value Before change "+callByValue.data);
        callByValue.change(500);
        System.out.println("Value After change  "+callByValue.data);

    }

}
