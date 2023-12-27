package CollectionsEx;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
     Stack<Integer> nums= new Stack<>();

    nums.push(10);
    nums.push(2);
    nums.push(3);

    System.out.println(nums);
   System.out.println("removed element is:-"+nums.pop()); 
    System.out.println(nums);
    System.out.println("top element in stack:-"+nums.peek());


}


}
