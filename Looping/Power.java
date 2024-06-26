// Write a program to input two numbers x and y and find x power y

package Looping;

import java.util.Scanner;

public class Power {

    static void findPower(int x, int y) {
        int sum = 1;
        for (int i = 1; i <= y; i++) {
            sum = sum * x;
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente first number :");
        int x = sc.nextInt();
        System.out.print("Enter second number :");
        int y = sc.nextInt();
        findPower(x, y);
        sc.close();

    }
}
