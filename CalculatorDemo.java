import java.util.*;
class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }

    public int sub(int n1,int n2){
        return n1-n2;
    }

    public int mul(int n1,int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
}

public class CalculatorDemo{
    public static void main(String args[]){
        int num1,num2;
        Calculator cal=new Calculator();
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("Addition:- "+cal.add(num1, num2));
        System.out.println("Subtraction:- "+cal.sub(num1, num2));
        System.out.println("Multiplication:- "+cal.mul(num1, num2));
        System.out.println("Division:- "+cal.div(num1, num2));
    }
}