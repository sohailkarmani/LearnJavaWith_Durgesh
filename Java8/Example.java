public class Example {

     public static void main(String[] args) {
        System.out.println("Explorin lambda expression ");
       MyInter  myInter=()->{
System.out.println("myMethod implementation using lambda");
        };
        myInter.myMethod();  
        System.out.println("--------------");
      Addition  addition=(int a,int b,int c)->{
int sum=a+b+c;
System.out.println("Sum is : "+sum);
        };
        addition.add(1,3,5);    }
}