package CollectionsEx;

import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
       Set<Integer> set=new HashSet<>();
    //    Set<Integer> set=new LinkedHashSet<>();
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(73);
        set.add(45);

        System.out.println(set);;
        System.out.println(set.remove(12));  //remove()-returns true or false it doesn't return a value
        

        System.out.println("13 is present in set:-"+set.contains(13));
        
        
        System.out.println("size of set:-"+set.size());
    
        set.clear();
        System.out.println(set);
    }
}
