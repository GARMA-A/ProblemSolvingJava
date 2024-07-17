import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the rows:");
        int rows = scan.nextInt();
        System.out.println("Enter the columns:");
         int columns = scan.nextInt();
        int numOfIColumn = columns - 2;               
         int numOfIRow = rows - 2;
        int I[] = new int[columns];

        int arr[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < columns; k++) {
                System.out.println("Enter the element at position (" + (i + 1) + ", " + (k + 1) + "): ");
                arr[i][k] = scan.nextInt();
            }
        }

        int num = 1;
        int max = 0;
        for (int i = 0; i < rows - 2; i++) {
            for (int k = 0; k < columns - 2; k++) {
                if (numOfIColumn != 0 && numOfIRow != 0) {
                    I[k] = arr[i][k] + arr[i][k + 1] + arr[i][k + 2] + arr[i + 1][k + 1] + arr[i + 2][k] + arr[i + 2][k + 1]
                            + arr[i + 2][k + 2];
                    System.out.println("THE I(" + num + ") = " + I[k]);
                    System.out.println("\n");
                    if (max < I[k]) {
                        max = I[k];
                    }
                    ++num;
                }
                --numOfIColumn;
            }
            numOfIColumn = columns - 2;
            --numOfIRow;
        }

        System.out.println("MAX = " + max);
    }
}