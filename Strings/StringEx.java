package Strings;

public class StringEx {
    public static void main(String[] args) {
        // created using : literal
        String str="This is working fine";
        // created using new keyword
        String str1=new String("This is not working fine");
        System.out.println(str);
        System.out.println(str1);
        // creating blank string
        String srt=new String();
        System.out.println(srt);

        char ch[]={'s','t','r','i','n','g','s'};    
        String s2=new String(ch);//converting char array to string   
        System.out.println(s2); 
        
    }
}
