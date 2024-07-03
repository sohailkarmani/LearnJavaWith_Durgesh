package Strings;

public class StringBufferExample2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello Iam a Java developer");
        System.out.println(str.insert(5, " hi "));
        System.out.println(str.replace(1, 8, " Java "));
        System.out.println(str.delete(5, 10));
        System.out.println(str.reverse());

    }
}
