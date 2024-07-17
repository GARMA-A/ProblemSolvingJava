import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        System.out.println("\t\nPlease enter your year : ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if((year%4==0 && year%100 !=0)|| year%400 == 0)
        {
            System.out.println("\t\n This is Leap Year ");
        }
        else
        {
            System.out.println("\t\n This is Not Leap Year ");
        }

    }
}
