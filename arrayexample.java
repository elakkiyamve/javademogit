import java.sql.SQLOutput;
import java.util.Scanner;

public class arrayexample{

    static void array1(int itr[]){
        int num = 1;
        for(int i=0;i<itr.length; i++,num++)
            itr[i] = num;

        for(int i=0; i<itr.length; i++)
            System.out.println("array itr has: " + itr[i]);

        int sum =0;
        for(int i=0; i<itr.length; i++,sum++)
        {
            sum = sum + itr[i];
            System.out.println("sum is"+ sum );
        }
    }

    public static void main(String [] args){
       /*
        // basic program structure for sum of 10 numbers using array
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int sum =0;
         for(int i=0; i<=9; i++)
         {
         sum =sum+a[i];
         }
         System.out.println("sum is" + sum);
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("total numbers :" );
        int get = sc.nextInt();
        int itr[] = new int[get];
        array1( itr);

    }
}
