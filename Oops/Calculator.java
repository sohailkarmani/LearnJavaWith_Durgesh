
// ..................Method overloading practice ........
package Oops;

public class Calculator {
    int x;
    int y;

    // non parameterized constructor
    public Calculator() {
        System.out.println("Non parameterized constructor");
        x = 10;
        y = 20;

    }

    public Calculator(int a, int b) {
        System.out.println("Creating object : parameterized constructor :");
        x = a;
        y = b;

    }

    // method overload
    public void sum() {
        System.out.println("Sum is : " + (x + y));

    }

    public void sum(int a) {
        System.out.println("Sum is " + (x + y + a));
    }

    public void sum(int a, int b) {
        System.out.println("Sum is " + x + y + a + b);
    }

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(100, 200);
        c1.sum();
        c2.sum();
        c1.sum(1, 2);

    }
}
