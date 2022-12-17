package Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item) throws StackException {
        if (isFull()){
            throw new StackException("Stack is Full, You can-not push further");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("Can not pop from an empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Can not peek from an empty stack");
        }
        return data[ptr];
    }

    public void display(){
        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public boolean isFull() {
        return ptr== data.length-1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
}
