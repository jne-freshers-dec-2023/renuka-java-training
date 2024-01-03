import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);


        arr.add(10);
        arr.add(70);
        arr.add(20);
        arr.add(30);
        arr.add(80);
        System.out.println(arr);

        //Object[] obj=arr.stream().toArray();

        System.out.println(Arrays.toString(arr.stream().toArray()));

//        System.out.println(obj instanceof Object );
//
//        String  a=(Arrays.toString(obj));
//        System.out.println(a);

        //addAll(collection)
        arr.addAll(arr1);
        System.out.println(arr);

        //addAll(index,collection)
        arr1.addAll(3,arr);
        System.out.println(arr1);

        Object objarr=arr.clone();
        System.out.println("clone:-"+objarr);


        //adding 100 to arr
        arr.add(100);
        System.out.println("after cloning arr"+arr);
        System.out.println("after cloning objarr"+objarr);
//        System.out.println("clone():-"+arr.clone());
        //clear() -removes all elements from arr1
//        arr1.clear();

        System.out.println(arr1);

        System.out.println(arr.getClass());

        System.out.println(arr.lastIndexOf(5));
        arr.ensureCapacity(20);



        //boolean contains(Object o)
        System.out.println("contains 100 in arr:"+arr.contains(100));

        //int indexOf(Object o)
        System.out.println("int indexOf(70):"+arr.indexOf(70));

        //E remove(int index)
        System.out.println("element at remove(6):"+arr.remove(6));

        System.out.println(arr);

        ArrayList<String> letters=new ArrayList<>();
        letters.add("A");
        letters.add("C");

        System.out.println("Letters:-"+letters);

        //boolean remove(Object o)
        System.out.println("letters.remove('c'):"+letters.remove("C"));

        Predicate<Integer> pr= a->(a%2!=0);

        System.out.println("arr.removeIf(pr):"+arr.removeIf(pr));

        System.out.println("after predicate removeif :-"+arr);

        //set(index,ele)
        arr.set(3,56);
        arr.set(6,34);
        System.out.println("arr:"+arr);

        System.out.println("sublist(2,6):-"+arr.subList(2,6));

        System.out.println(arr.size());

       arr.trimToSize();

        System.out.println(arr);

    }

}