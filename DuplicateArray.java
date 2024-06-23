import java.util.Scanner;
public class DuplicateArray {
    public static void main(String[] args) {
        System.out.println("Enter size of array :");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        //creating array
        int arr[]=new int[size];
        System.out.println("Enter elements of array one by one :");
        for(int i=0;i<arr.length;i++){
            int input=sc.nextInt();
            arr[i]=input;
        }
        System.out.println("Duplicate Elements in Given Array ");
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j])
                System.out.println(arr[j]);
            

          }
        }
        sc.close();
    }
}
