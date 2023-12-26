import java.util.*;
public class UpdatedSwitch{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String day;
        day=sc.nextLine();
        String result="";
        switch(day){
            case "sunday"  : System.out.println("its a weekend");
                                break;
            case "monday" : System.out.println("Its a working day");
                                break;

            default : result="enter a valid input";
        
        }
}}