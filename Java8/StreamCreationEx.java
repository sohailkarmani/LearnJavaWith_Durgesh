import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationEx {
    public static void main(String[] args) {
        
        // 1. Empty Stream
        Stream<Object> emptyStream =Stream.empty();
        System.out.println(emptyStream.count());

        // 2. Stream from collection
        List<String> laptops=new ArrayList<>();
        laptops.add("DELL");
        laptops.add("Macbook pro");
        laptops.add("Leveno");
        Stream<String> collectionStream=laptops.stream();
        System.out.println(collectionStream.count());

        // using builder to create stream
        Stream<Integer>integerStream= Stream.<Integer>builder()
        .add(34)
        .add(4)
        .add(87)
        .build();
        System.out.println(integerStream.count());
// 4. creating stream using generate
 Stream<String>generateStream=Stream.generate(()->
"Sohail"
).limit(5); 
System.out.println("Stream generator");
System.out.println(generateStream.count());

   
    }
}
