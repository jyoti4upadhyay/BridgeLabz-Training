import java.util.*;

abstract class Car{
    public boolean getIsSedan(){
        return false;
    };
    public int getSeats(){
        return 0;
    }
    public abstract int getMileage();
}
class WagonR extends Car{
    @Override
    public boolean getIsSedan(){
        return true;
    }
    @Override
    public int getSeats(){
        return 6;
    }
    @Override
    public int getMileage(){
        return 80;
    }
} 

class HondaCity extends Car{
    @Override
    public boolean getIsSedan(){
        return false;
    }
    @Override
    public int getSeats(){
        return 7;
    }
    @Override
    public int getMileage(){
        return 40;
    }

}
class InnovaCrysta extends Car{
    @Override
    public boolean getIsSedan(){
        return true;
    }
    @Override
    public int getSeats(){
        return 8;
    }
    @Override
    public int getMileage(){
        return 110;
    }
}
public class CarMain{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 0/1/2");
        int num=sc.nextInt();
        switch(num){
            case 0:
                WagonR wr=new WagonR();
                System.out.println(wr.getIsSedan());
                System.out.println(wr.getSeats());
                System.out.println(wr.getMileage());
                break;
            
            case 1:
                HondaCity hc=new HondaCity();
                System.out.println(hc.getIsSedan());
                System.out.println(hc.getSeats());
                System.out.println(hc.getMileage());
                break;
            case 2:
                InnovaCrysta ic=new InnovaCrysta();
                System.out.println(ic.getIsSedan());
                System.out.println(ic.getSeats());
                System.out.println(ic.getMileage());
                break;

            default:
                break;
        }
    }
}