package Queue;

public class QueueMain {
    public static void main(String[] args) throws CustomException {
        CustomCircularQueue queue = new CustomCircularQueue();
        queue.insert(45);
        queue.insert(20);
        queue.insert(4);
        queue.insert(145);
        queue.insert(45);

        queue.display();

        queue.remove();
        System.out.println();
        queue.display();


    }
}
