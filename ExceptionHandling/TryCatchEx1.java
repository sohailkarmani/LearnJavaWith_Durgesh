package ExceptionHandling;
import java.util.*;
public class TryCatchEx1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number :");
        int n1=sc.nextInt();
        System.out.print("Ente second number :");
        int n2=sc.nextInt();
        int data=n1/n2;
        System.out.println(data);
        System.out.println("Rest of code");
        sc.close();


    }
}
