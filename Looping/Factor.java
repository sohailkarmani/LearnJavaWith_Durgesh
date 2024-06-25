package Looping;

import java.util.Scanner;

public class Factor {

    static void printFactor(int num) {
        System.out.println("Factors :");
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + "  ");
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("The sum of factors is : " + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printFactor(num);
        sc.close();
    }
}
