import java.util.Scanner;

public class summation {

    static int add(int one, int two)
    {
        int sum = one + two;
        return sum;

    }
    static int add(int one, int two, int three)
    {
        int sum1 = one + two + three;
        return sum1;

    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("first number is :" );
        int one = sc.nextInt();
        System.out.println("2 :" );
        int two = sc.nextInt();
        System.out.println("3: " );
        int three = sc.nextInt();

        int sum = add(one, two);
        System.out.println("sum is :" + sum);
        int sum1 = add(one, two, three);
        System.out.println("sum is :" + sum1);

    }


}
