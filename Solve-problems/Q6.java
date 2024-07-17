import java.util.Scanner;
public class Q6 {
    public static void main(String[] args)
    {
        int x[] = {1,2,3,4,5,6};
        System.out.println("\t\nHELLO SIR ");
        System.out.println("\t\nPlease enter what do you want to do on matrix  ");
        System.out.println("\t\nthe matrix = {1,2,3,4,5,6} ");
        System.out.println("\t\nfor sum Write [+] sub [-] div [/] mul [*]");
        System.out.println("\t\nfor find max number Write [x] to find min number [n]");
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        if(c=='+')
        {
            int sum=0;
           for(int i = 0 ; i<=5 ; i++)
           {
             sum+=x[i];
           }
           System.out.println("\t\nThe sum of the matrix =  " + sum);
        }
        else if (c=='-')
        {
              int sub=0;
           for(int i = 0 ; i<=5 ; i++)
           {
             sub-=x[i];
           }
           System.out.println("\t\nThe sub of the matrix =  " + sub);

        }
        else if (c=='/')
        {
          int div=1;
           for(int i = 0 ; i<=5 ; i++)
           {
             div/=x[i];
           }
           System.out.println("\t\nThe sub of the matrix =  " + div);

        }
         else if (c=='*')
        {
                  int mul=1;
           for(int i = 0 ; i<=5 ; i++)
           {
             mul*=x[i];
           }
           System.out.println("\t\nThe sub of the matrix =  " + mul);
            
        }
          else if (c=='x')
        {
                  int max=x[0];
           for(int i = 0 ; i<=5 ; i++)
           {
             if(max<x[i])
             {
                max=x[i];
             }
           }
           System.out.println("\t\nThe maximum number =  " + max);
            
        }
          else if (c=='n')
        {
                    int min=x[0];
           for(int i = 0 ; i<=5 ; i++)
           {
             if(min>x[i])
             {
                min=x[i];
             }
           }
           System.out.println("\t\nThe maximum number =  " + min);
            
        }
     
       
    }
}
