import java.util.Scanner;

class Circle{
    double radius;

    double getArea(){
        double area=3.14*radius*radius;
        return area;
    }
    void display(){
        System.out.println("Area "+getArea());
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle circle=new Circle(); 
        System.out.println("Enter radius");
        circle.radius=sc.nextDouble();
        circle.display();
        
    }
    
}
