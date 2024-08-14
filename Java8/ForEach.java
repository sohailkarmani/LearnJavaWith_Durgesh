import java.util.Set;

public class ForEach {
    public static void main(String[] args) {
        Set <String> set=Set.of("Sohail","Khushal","Haresh","Nikil");
        set.forEach(item->{
            System.out.println("length :"+item.length());
            System.out.println(item);
            System.out.println("-------------");
        });
            
        
    }
}
