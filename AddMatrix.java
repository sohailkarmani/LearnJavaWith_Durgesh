import java.util.Scanner;
public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row :");
        int row = sc.nextInt();
        System.out.print("Enter the columns :");
        int col = sc.nextInt();
        // creating array
        int arr1[][] = new int[row][col];
        int arr2[][] = new int[row][col];
        int result[][] = new int[row][col];
        System.out.println("Enter data in First matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(i + " , " + j);
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter data in Second matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(i + " , " + j);
                arr2[i][j] = sc.nextInt();
            }
        }
        // adding  two matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Matrix 1 :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matrix 2 :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        // printing resultant matrix
        System.out.println("Result :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
