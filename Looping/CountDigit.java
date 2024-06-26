package Looping;

import java.util.Scanner;

public class CountDigit {
    static void countDigit(int n){
        int counter=0;
        while (n!=0) {
            int r=n%10;
            counter++;
            n=n/10;
            
        }
        System.out.println("Digit count :"+counter);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        countDigit(n);
        sc.close();

        
        
    }
}
