import java.util.*;
public class MultiDimentionalArray{
    public static void main(String[] args){
        int nums[][]= new int[3][3];
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                nums[i][j]=(int)(Math.random()*10);
            }
        }

        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }
         for (int i=0;i<3;i++)
         {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        

    }
}