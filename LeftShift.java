//Write a program to left rotate the elements of an array
import java.util.Scanner;
public class LeftShift {
    public static void main(String[] args) {
        System.out.println("Enter size of Array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // creating array
        int arr1[] = new int[size];
        System.out.println("Enter elements of array one by one : ");
        for (int i = 0; i < size; i++) {
            int input = sc.nextInt();
            arr1[i] = input;
        }
        // rotate array
        int first = arr1[0];
        for (int i = 0; i < arr1.length - 1; i++) {
            arr1[i] = arr1[i + 1];

        }
        arr1[arr1.length - 1] = first;
        System.out.println("Rotate Array :");
        for (int a : arr1) {
            System.out.println(a + " ");
        }
        System.out.println();
        sc.close();

    }
}
