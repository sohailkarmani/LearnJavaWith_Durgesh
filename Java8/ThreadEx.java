import java.util.ArrayList;
import java.util.List;

public class ThreadEx {
    public static void main(String[] args) {
       
        Thread thread=new Thread(()->{
            System.out.println("new thread");
        
                });
                List<String> list=new ArrayList<>();
                list.add("Sohail");
                list.add("Haresh");

                //Consumer<String> consumer= 
                list.forEach((String x)->{
                    System.out.println(x);
                });
    }
}
