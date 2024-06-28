package Pattern;

import java.util.Scanner;

public class Pattern1 {

    static void numberPattern(int num) {
        for (int i =1; i<=num; i++) {
            for (int j =1; j<=num; j++) {
                System.out.print(j + " ");
                num--;
            }
            System.out.println();
            //num--;
        }
        
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        numberPattern(num);
        sc.close();

    }
}
