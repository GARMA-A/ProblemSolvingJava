import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        System.out.println("\t\nEnter a Number  ");
        Scanner scan = new Scanner(System.in);
        int  num1 = scan.nextInt();
        boolean prime = true;
        for(int i = 2 ; i<=num1/2 ; i++)
        {
           if(num1%i==0)
           {
             prime = false ;
           }
        }
        if(prime)
        {
            System.out.println("\t\nYES...Your number is prime  ");

        }
        else
        {
            System.out.println("\t\nNO...Your number is NOT prime  ");
        }

    }
}
