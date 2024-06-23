//Calculate Electricity bill according to given condition
//for first 50 units Rs. 0.50/unit
//for next 100 units Rs. 0.75/unit
//for next 100 units Rs. 1.20/unit
//for unit above 250 Rs. 1.50/unit an additional sucharge of 20% is added to the bill
import java.util.Scanner;
public class Calc_Ele_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units :");
        double unit = sc.nextInt();

        if (unit >= 0 && unit <= 50) {
            System.out.println("The Bill is : " + unit * 0.05);

        } else if (unit > 50 && unit <= 150) {
            System.out.println("The Bill is : " + unit * 0.75);
        } else if (unit > 150 && unit <= 250) {
            System.out.println("The Bill is : " + unit * 1.20);
        } else {
            double bill = unit * 1.50 + ((20 / 100.0) * unit);
            System.out.println("The Bill is : " + bill);
        }
        sc.close();

    }
}
