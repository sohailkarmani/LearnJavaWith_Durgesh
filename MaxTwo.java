import java.util.Scanner;


public class MaxTwo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers  :");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("num1 is max");
        }
        else{
            System.out.println("num2 is max");
        }
        sc.close();
        
    }
}
