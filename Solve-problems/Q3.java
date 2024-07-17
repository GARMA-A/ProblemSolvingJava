import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        System.out.println("\tEnter Two Numbers  \n ");
        Scanner scannern1 = new Scanner(System.in);
        int num1 = scannern1.nextInt();
         Scanner scannern2 = new Scanner(System.in);
        int num2 = scannern2.nextInt();
         System.out.println("\tInter the operator (+ , - , * , /)  \n ");
        Scanner scanner = new Scanner(System.in);
        char calc = scanner.next().charAt(0);
        if(calc == '+')
        {
         System.out.println("\nThe sum = "+ (num1 + num2));
        }
        else if(calc == '-')
        {
           System.out.println("\nThe sub = "+ (num1 - num2));
        }
          else if(calc == '/')
        {
           System.out.println("\nThe div = "+ (num1 / num2));
        }
          else if(calc == '*')
        {
         System.out.println("\nThe mul = "+ (num1 * num2));
        }
    }
}
