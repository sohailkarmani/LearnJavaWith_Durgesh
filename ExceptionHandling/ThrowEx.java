package ExceptionHandling;

import java.util.Scanner;

public class ThrowEx {
    public static void valiDate(int age) {
        if (age < 18) {
            throw new ArithmeticException("not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age :");
        int age = sc.nextInt();
        valiDate(age);
        System.out.println("Rest of code");
        sc.close();

    }

}
