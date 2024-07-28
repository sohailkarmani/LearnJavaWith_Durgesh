//  create regular expression that accept alphanumeric characters only
import java.
util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REDynamicEx {

    public static void CheckStringAgainstRE(String re,String str){
        Pattern pattern=Pattern.compile(re);
        Matcher matcher=pattern.matcher(str);
        boolean matches=matcher.matches();
        System.out.println(matches);

    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter regular expression");
            Scanner sc=new Scanner(System.in);
            String re=sc.nextLine();
            System.out.println("Enter your string ");
            String str=sc.nextLine();
            CheckStringAgainstRE(re,str);
            System.out.println("Are u want to exist");
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("Y")){
                System.out.println("Thank u for using app");
                break;
            }
            
        }

        
    }
}
