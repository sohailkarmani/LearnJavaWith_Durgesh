//Write a program to find the factorial of number
package Looping;

import java.util.Scanner;

public class Facrorial {
    static int fact(int num) {
        int result = 1;
        for (int i = num; i >= 1; i--) {
            result = (result) * i;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        System.out.println(fact(num));
        fact(num);
        sc.close();

    }
}
