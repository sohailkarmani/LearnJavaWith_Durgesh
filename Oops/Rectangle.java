package Oops;

public class Rectangle extends Shape {
    public Rectangle(int lenght,int breadth){
        super(lenght, breadth);
    }
    public void CalculateParimeter(){
        System.out.println("Parimeter : "+2*(this.lenght*this.breadth));
    }
    
}
