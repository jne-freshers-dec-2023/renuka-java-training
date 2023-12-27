package CollectionsEx;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String args[]){

        //creating  non-primitive set using HashSet()
        Set<StudentDemo> stud=new HashSet<>();
        stud.add(new StudentDemo("Renuka", 101));
        stud.add(new StudentDemo("Anjali", 102));
        stud.add(new StudentDemo("Vaishoo", 103));
        stud.add(new StudentDemo("Shambhavi", 104));
        stud.add(new StudentDemo("Manjula", 105));
        stud.add(new StudentDemo("Vaishoo", 103));

        System.out.println(stud);

        
    }
}
