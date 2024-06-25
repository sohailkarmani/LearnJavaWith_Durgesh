package Looping;

import java.util.Scanner;

public class Reverse {
    static void reverse(int num){
        int rev=0;
        while (num>0) {
            int r =num%10;
            rev=(rev*10)+r;
            num=num/10;
            
        }
        System.out.println("Reverse Number :"+rev);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int num=sc.nextInt();
        reverse(num);
        
        
    }
}
