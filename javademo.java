import java.util.Scanner;

public class javademo
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int day; int x;
        String a[] = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

        System.out.println("day: ");
        day = sc.nextInt();
        int value = day;
        if(value>=7)
        {
             x = day%7;
             value = x;
            System.out.println("Xis "+ x);
        }
        System.out.println("day present in value is: " + value);

        switch (value) // { modulo(value) ;
        {
                case 0:
                    System.out.println("day of the week is : " + a[0]);
                    break;
                case 1:
                    System.out.println("day of the week is : " + a[1]);
                    break;
                case 2:
                    System.out.println("day of the week is : " + a[2]);
                    break;
                case 3:
                    System.out.println("day of the week is : " + a[3]);
                    break;
                case 4:
                    System.out.println("day of the week is : " + a[4]);
                    break;
                case 5:
                    System.out.println("day of the week is : " + a[5]);
                    break;
                case 6:
                    System.out.println("day of the week is : " + a[6]);
                    break;

        }
    }


}
