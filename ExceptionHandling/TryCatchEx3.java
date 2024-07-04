package ExceptionHandling;

public class TryCatchEx3 {
    public static void main(String[] args) {
        try {
            int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, };
            System.out.println(ar[11]); // may through exception

        } catch (Exception e) {
            System.out.println(e);

        }
        System.out.println("Rest of code");
    }
}
