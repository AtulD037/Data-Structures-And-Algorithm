package Stack;

import java.util.*;

public class InBuiltExample {
    public static void main(String[] args) {
        System.out.println("Stack\n\n");
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(80);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println("\nQueue");


        Queue<Integer> queue = new LinkedList<>() ;
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();
        System.out.println(queue);

        System.out.println("\n Deque");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(9);
        deque.addLast(78);
        System.out.println(deque);
        deque.addFirst(7);
        System.out.println(deque);

    }
}
