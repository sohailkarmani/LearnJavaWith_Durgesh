package ExceptionHandling;

public class TestFinallyBlock {
    public static void main(String[] args) {
        try{
            int data=25/0;
            System.out.println(data);
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("allways executed exception handle or not");
        }
    }
}
