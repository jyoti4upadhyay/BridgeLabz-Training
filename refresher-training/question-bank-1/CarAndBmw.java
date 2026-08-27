import java.util.*;
import java.lang.*;
class Car{
    int numberOfTyres;
    double speed;
    public void accelerate(){
        System.out.println("Car has 4 tyres");
    }
    public void speed(){
        System.out.println("Car's speed is 45.67 km/hr");
    }
}

class BMW extends Car{
    int numberOfTyres;
    double speed;
    @Override
    public void accelerate(){
        System.out.println("BMW has 4 tyres");
    }
    @Override
    public void speed(){
        System.out.println("BMW's speed is 78.90 km/hr");
    }

}
class CarAndBmw{
    public static void main(String[] args){

        Car car=new Car();
        car.accelerate();
        car.speed();

        Car bmw=new BMW();
        bmw.accelerate();
        bmw.speed();

        BMW bMw=new BMW();
        bMw.accelerate();
        bMw.speed();
    }
}