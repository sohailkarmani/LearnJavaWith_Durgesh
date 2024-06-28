package Oops;

public abstract class Shape {
    int lenght;
    int breadth;
    public Shape(int lenght,int breadth){
        this.lenght=lenght;
        this.breadth=breadth;
    }
    // concrete method
public void CalculateArea(){
    System.out.println("Area  :"+(this.lenght*this.breadth));
}
abstract public void CalculateParimeter();

}
