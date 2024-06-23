import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array  : ");
        int size=sc.nextInt();
        // Creating array
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            int input=sc.nextInt();
            arr[i]=input;
        }
        System.out.println("-------------Reverse Array----------------");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
