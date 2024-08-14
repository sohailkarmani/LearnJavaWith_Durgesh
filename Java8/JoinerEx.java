import java.util.StringJoiner;

public class JoinerEx {
    public static void main(String[] args) {
        StringJoiner joiner=new StringJoiner(",","{","}");
        joiner.add("Sohial");
        joiner.add("Haresh");
        System.out.println(joiner );
    }
    
}
