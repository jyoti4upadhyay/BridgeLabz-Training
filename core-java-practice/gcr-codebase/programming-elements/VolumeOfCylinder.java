import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double height=sc.nextInt();
        double radius=sc.nextDouble();
        double volume=3.14*Math.pow(radius,2)*height;
        System.out.println("Volume of cylinder "+ volume);
        
        
    }
    
}
