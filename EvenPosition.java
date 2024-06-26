
// Write a program to take elements of an array from user and print the elements of an array
//present on even position
import java.util.Scanner;
public class EvenPosition {
    static void evenPosition(int arr[]) {
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                System.out.println(arr[j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        // creating array
        int arr[] = new int[size];
        System.out.println("Enter elements of array one by one :");
        for (int i = 0; i < arr.length; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }
        System.out.println("The even position number are :");
        evenPosition(arr);
        sc.close();
    }
}
