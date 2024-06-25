package Looping;

import java.util.Scanner;

public class Hcf_Lcm {
    static int findLcm(int num1,int num2){
        int lcm=(num1*num2)/findHcf(num1, num2);
        return lcm;
    }
    static int findHcf(int num1, int num2) {
        int small, large;
        if (num1 < num2) {
            small = num1;
            large = num2;
        } else {
            small = num2;
            large = num1;
        }
        while (small != 0) {
            int temp = small;
            small = large % small;
            large = temp;

        }
        return large;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int hcf = findHcf(num1, num2);
        System.out.println("HCF = " + hcf);
        int lcm=findLcm(num1, num2);
        System.out.println("LCM = "+lcm);

    }

}
