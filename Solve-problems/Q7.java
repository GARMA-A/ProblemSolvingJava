import java.util.Scanner;
public class Q7 {
    public static void main(String[] args)
    {
        System.out.print("\n\tPlease Enter the principal = ");
       Scanner scan = new Scanner(System.in);
        double Principal = scan.nextDouble();
        System.out.print("\n\tPlease Enter the Rate = ");
        double Rate = scan.nextDouble();
        System.out.print("\n\tPlease Enter the Time = ");
        double Time = scan.nextDouble();
        System.out.print("\n\t The Interest time = "+(Principal*Rate*Time)/100);

    }
}
