package CollectionsEx;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();

        adq.offer(65);
        adq.offerFirst(23);
        adq.offerLast(34);
        adq.offer(67);  
        adq.offer(67);
        adq.offer(35);
        System.out.println("arrayDeque");
        System.out.println(adq);

        System.out.println("adq.poll():-"+adq.poll());

        System.out.println("adq.peek():-"+adq.peek());
        
        System.out.println("adq.pollFirst():-"+adq.pollFirst());
        System.out.println(adq);

        System.out.println("adq.pollLast():-"+adq.pollLast());
        System.out.println(adq);
    
    }
}
