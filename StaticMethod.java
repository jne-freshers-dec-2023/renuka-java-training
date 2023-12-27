import java.util.*;
/**
 *  
 */
class  StaticDemo {
    String name;
    int roll_no;
    static String clg_name= "SSWCOE";

    public void show(){
        System.out.println("name:"+name+" roll No:"+roll_no+"College:"+clg_name);
    }

    public static void showDetails(StaticDemo st){
             System.out.println("name:"+st.name+" roll No:"+st.roll_no+"College:"+clg_name);
    }

    
}

public class StaticMethod {
    public static void main(String[] args) {
        StaticDemo st=new StaticDemo();
        st.name="Renuka";
        st.roll_no=101;
        st.show();
        System.out.println("College name:"+StaticDemo.clg_name);
        st.showDetails(st);
    }
}
