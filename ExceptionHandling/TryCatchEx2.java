package ExceptionHandling;

import java.util.Scanner;

public class TryCatchEx2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number :");
        int n1=sc.nextInt();
        System.out.print("Ente second number :");
        int n2=sc.nextInt();
        try {
            int data=n1/n2;
        } catch (Exception e) {
            System.out.println("Zero can not divide by any number ");
        }
        System.out.println("Rest of code");
        sc.close();
    }
}
