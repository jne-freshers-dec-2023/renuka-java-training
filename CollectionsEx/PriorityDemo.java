package CollectionsEx;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityDemo {
    public static void main(String[] args) {
        Queue<Integer> pqueue=new PriorityQueue<>(Comparator.reverseOrder());
        pqueue.offer(90);
        pqueue.offer(10);
        pqueue.offer(30);
        pqueue.offer(29); 
        System.out.println(pqueue);

        System.out.println(pqueue.poll());
        System.out.println(pqueue.peek());
      
        


    }
}
