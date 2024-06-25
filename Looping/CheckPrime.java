package Looping;

import java.util.Scanner;

public class CheckPrime {
    static boolean checkPrime(int num) {
    
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }

    }

    static boolean checkPrimee(int num){
        boolean flag=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=false;
                break;

            }
        }
        return flag;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(checkPrimee(num)){
            System.out.println("Prime number ");
        }
        else{
            System.out.println("Not prime Number ");
        }
        sc.close();
    }

}
