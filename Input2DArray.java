import java.util.Scanner;
public class Input2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows :");
        int row=sc.nextInt();
        System.out.print("Enter the Columns :");
        int col=sc.nextInt();
        //creating 2D array
        int arr[][]=new int[row][col];
        System.out.println("Enter the elements one by one :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(i+" , "+j);
                arr[i][j]=sc.nextInt();
            }
        }
        //input code end here
        System.out.println("Matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
          sc.close();
        
    }
}
