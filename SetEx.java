import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {
        TreeSet<Integer> s=new TreeSet<>();
        s.add(2);
        s.add(6);
        s.add(3);
        s.add(10);
        s.add(64);
        s.add(45);

        System.out.println("set s elements:-"+s);

        System.out.println("hascode():"+s.hashCode());
        System.out.println(s.getClass());

        System.out.println(s.isEmpty());

        //ceiling(ele) returns equal and greatest element
        System.out.println(s.ceiling(44));

        //floor returns equal and less element
        System.out.println(s.floor(8));

    s.add(1);
        //SortedSet headSet(E toElement)
        System.out.println("SortedSet headSet(E toElement)"+s.headSet(1));

        //NavigableSet headSet(E toElement, boolean inclusive)

        //doubt
        System.out.println("NavigableSet headSet(E toElement, boolean inclusive)"+s.headSet(10,false));

        //s.higher(45) returns closet greatest ele does not return equal
        System.out.println(s.higher(45));

        ////s.lower(10) returns closet greatest ele does not return equal
        System.out.println(s.lower(10));

        //E pollFirst()	It is used to retrieve and remove the lowest(first) element.
        System.out.println(s.pollFirst());

        //E pollLast()	It is used to retrieve and remove the highest(last) element.
        System.out.println(s.pollLast());
    }
}
