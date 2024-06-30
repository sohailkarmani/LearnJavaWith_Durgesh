package Pattern;
import java.util.Scanner;
public class Pattern3{
    static void numberPattern(int num) {
        for (int i =1; i<=num; i++) {
            for (int j =1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=num;i++){
            for(int j=num-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
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




