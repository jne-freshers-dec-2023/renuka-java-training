package CollectionsEx;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> rollNo= new ArrayList<>();
        rollNo.add(10);
        rollNo.add(20);
        rollNo.add(30);
        rollNo.add(40);
        rollNo.add(50);
        rollNo.add(5,80);
        
        System.out.println(rollNo);

        ArrayList<Integer> newList=new ArrayList<>();
        newList.add(89);
        newList.add(78);
        newList.add(54);

        rollNo.addAll(3,newList);

        System.out.println(rollNo);
        System.out.print("element at index of 4:-");
        System.out.println(rollNo.get(4));

        rollNo.remove(3);
        rollNo.remove(Integer.valueOf(30));
        System.out.println("after removing ");
        System.out.println(rollNo);

        //printing array list using for loop
        for(int i=0;i<rollNo.size();i++){
            System.out.println("element at index of: "+i+" = "+rollNo.get(i));;
        }

        //accessing elements using foreach

        for(Integer ele:rollNo){
            System.out.println("elements: "+ele);
        }

        // Iterator<Integer> it=rollNo.iterator();
        // while (it.hasNext()) {
        //     System.out.println("Iterator "+ it.next());
        // }
    }   

    
}