package _10_generic_stack_queue;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.offer(3);

        System.out.println(myQueue.element());
        System.out.println(myQueue.peek());

        System.out.println(myQueue.remove());
        System.out.println(myQueue.poll());
    }
}
