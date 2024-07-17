import java.util.Scanner;
public class Q1{
public static void main(String[] args) {
    System.out.println("PLEASE ENTER THE TIME (in second)");
    Scanner time = new Scanner(System.in);
    double t = time.nextDouble();
    double g = 9.8;
    System.out.println("The Distance  = "+0.5*g*t*t + " Meter");
}
}