import java.util.*;

public class ArrayCopy {
    public static void main(String[] args) {
        System.out.print("Enter size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // creating array
        int arr1[] = new int[size];
        System.out.println("Enter elements of array :");
        for (int i = 0; i < arr1.length; i++) {

            int input = sc.nextInt();
            arr1[i] = input;
        }

        // creating array to store copied elements
        int arr2[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            // copy the data
            arr2[i] = arr1[i];
        }

        // printing new array
        System.out.println("Copied array :");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        sc.close();

    }
}
