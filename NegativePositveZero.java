import java.util.Scanner;

public class NegativePositveZero {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();

        if(num==0){
            System.out.println("The num is zero");
        }
        else if(num>0){
            System.out.println("The num is positive ");

        }
        else{
            System.out.println("The num is negative");
        }
        sc.close();
        
    }
}
