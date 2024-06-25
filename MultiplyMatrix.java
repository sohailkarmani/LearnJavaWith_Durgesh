import java.util.Scanner;
public class MultiplyMatrix {
    static Scanner sc = new Scanner(System.in);
    static void inputMatrix(int arr[][], String MatrixName) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Input for " + MatrixName + "   " + i + "," + j + "   : ");
                arr[i][j] = sc.nextInt();
            }
        }

    }

    static void pritnMatrix(int arr[][], String title) {
        System.out.println(title);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.println();

    }

    static int[][] MultiplyMat(int m1[][], int m2[][]) {
        int r3 = m1[0].length;
        int c3 = m2.length;
        int m3[][] = new int[r3][c3];
        for (int i = 0; i < r3; i++) {
            for (int j = 0; j < c3; j++) {
                for (int k = 0; k < c3; k++) {
                    m3[i][j] = m3[i][j] + (m1[i][k] * m2[k][j]);
                }
            }
        }
        return m3;

    }

    public static void main(String[] args) {
        System.out.print("Enter rows :");
        int row = sc.nextInt();
        System.out.print("Enter columns :");
        int col = sc.nextInt();
        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];
        inputMatrix(matrix1, "M1");
        inputMatrix(matrix2, "M2");
        pritnMatrix(matrix1, "Matrix 1");
        pritnMatrix(matrix2, "Matrix 2");

        int result[][] = MultiplyMat(matrix1, matrix2);

        pritnMatrix(result, "Product");

    }

}