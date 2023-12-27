import java.util.*;
public class LoopsEx{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int  num=sc.nextInt();
        int n=num;
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("While Loop");
        System.out.println("sum of a number "+n+" is "+sum);

        System.out.println("For loop Example");
        for(int i=0;i<10;i++){
            System.out.println("i:= "+i);
        }


        System.out.println("Do-While example");
         int i=7;
        do{
           
            System.out.println("i= "+i);
            i++;
        }while(i<=5);
    }
}