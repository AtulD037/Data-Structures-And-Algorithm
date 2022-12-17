package Stack;

public class MainStack {
    public static void main(String[] args) throws StackException {
//        CustomStack stack = new CustomStack(5);
//        stack.push(5);
//        stack.push(15);
//        stack.push(25);
//        stack.push(35);
//        stack.push(45);
//
//        stack.display();
//
//
//        System.out.println("Peek element is "+stack.peek()); // This will give us last item inserted i.e. 45
//
//        System.out.println("Popped element is "+stack.pop()); // This will remove the last item that we have entered i.e. 45
//        System.out.println("Popped element is "+stack.pop()); // This will remove the last item that we had left with i.e. 35
//
//        stack.display();

        // Dynamic Stack

        DynamicStack stack = new DynamicStack(5);
        stack.push(34);
        stack.push(35);
        stack.push(36);
        stack.push(37);
        stack.push(38);
        stack.push(39);
        stack.push(44);
        stack.push(54);
        stack.display();


    }
}
