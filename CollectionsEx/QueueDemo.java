package CollectionsEx;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(2);
        queue.offer(4);
        queue.offer(6);
        System.out.println(queue);

        System.out.println("Removed element from queue:-"+queue.poll());
        System.out.println("after removing:-"+queue);
        System.out.println("Peek ele:-"+queue.peek());
        System.out.println(queue.element());
        System.out.println(queue);
    }
}
