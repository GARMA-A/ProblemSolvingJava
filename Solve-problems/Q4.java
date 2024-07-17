import java.util.Scanner;

public class Q4 {
    public static boolean torf(String theword) {
        int last = theword.length() - 1;
        int first = 0; 
        while (last > first) {
            if (theword.charAt(last) != theword.charAt(first)) 
            {
                return false;
            }
            last--;
            first++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String theword = scanner.nextLine();//line بدل String
        
        if (torf(theword)) {
            System.out.println("Right! It's a palindrome string.\n");
        } else {
            System.out.
            println("No! It's not a palindrome string.\n");
        }
    }
}