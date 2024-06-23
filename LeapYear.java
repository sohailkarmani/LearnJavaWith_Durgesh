//write a program to input a year and check whether its leap year or not 
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check its leap year or not :");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("The year is leap year");
        } else {
            System.out.println("This is not leap year");
        }
        sc.close();

    }
}
