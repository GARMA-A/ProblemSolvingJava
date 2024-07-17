import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
    System.out.println("\t\t\nWelcome to Converter program\n ");
    System.out.println("\tfrom Celsius to Fahrenheit (ENTER : c) \n ");
    System.out.println("\tfrom Fahrenheit to Celsius (ENTER : f) \n ");
    Scanner scanner = new Scanner(System.in);
    char corf = scanner.next().charAt(0);
    if(corf == 'f'||corf == 'F' )
    {
        System.out.println("\tPlease Enter Fahrenheit  number  \n ");
            Scanner scanner2 = new Scanner(System.in);
            int f2 = scanner2.nextInt();
            int c2 = f2-32;
            int c3 = c2 * 5/9;
            System.out.println("\tThe Celsius =  " + c3);


    }
    else if(corf == 'c'||corf == 'C')
    {
            System.out.println("\tPlease Enter Celsius number  \n ");
            Scanner scanner3 = new Scanner(System.in);
             double c1 = scanner3.nextDouble();
            double f1 = (c1*9/5)+32;
            System.out.println("\tThe Fahrenheit  =   " + f1);

    }
    
  
}
    
}
