/**
 * Input
 */
import java.io.*;
public class Input {

    public static void main(String args[]) throws IOException{
        // java.util.Scanner sc=new java.util.Scanner(System.in);
        // int n=sc.nextInt();
        // System.out.println("value of n is "+n);
         InputStreamReader strReader=new  InputStreamReader(System.in);
         BufferedReader bufferedReader=new  BufferedReader(strReader);
        String inputStr=bufferedReader.readLine();
        System.out.println(inputStr);

    }
}