package Queue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++]=item;
        return true;
    }

    public int remove() throws CustomException{
        if (isEmpty()){
            throw new CustomException("Queue is Empty and Can't remove from an empty queue");
        }
        int removed = data[0];

        // Now shift the element to left
        for (int i = 1; i < end; i++) {
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public int peek() throws CustomException {
        if (isEmpty()) {
            throw new CustomException("Queue is empty and can't peek from it");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }


    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end==0;
    }
}
