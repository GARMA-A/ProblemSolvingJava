 import java.util.Scanner;
 public class Q10 {
    public static void main(String[] args) {
        System.out.println("ENTER your word : ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("ENTER The char you want to count :  ");
        char c = scan.next().charAt(0);
        int size = s.length() - 1 ;
        int ctr = 0;
        for(int i = 0 ; i<=size; i++)
        {
            if(s.charAt(i) == c)
            {
                 ctr++;
            }

        }
        System.out.println("The char ("+ c +") Repeated "+ctr +" times");


    }
}
