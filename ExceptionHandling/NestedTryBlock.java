package ExceptionHandling;

public class NestedTryBlock {
    public static void main(String[] args) {
        
        try{
            // inner try block 1
            try {
                int b=39/0;
                
            } 
            //catch block of inner try block
            catch (ArithmeticException e) {
                 System.out.println(e);
                 
            }
            // inner try block 2
            try {
                int a[]=new int[5];
                a[5]=5;
            }
            // catch block of inner try block 2
             catch (ArrayIndexOutOfBoundsException e) {
                 System.out.println(e);
            }
            System.out.println("Othe statement");
        }
        //..
        catch(Exception e){
            System.out.println("Handle the exception outer catch");

        }
    }
}
