import java.util.Scanner;
public class HeightConversion {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        double heightcm=sc.nextDouble();

        double totalinch=heightcm/2.54;
        int heightfeet=(int)(totalinch/12);
        double heightinch=totalinch%12;

        System.out.println("Your Height in cm is "+heightcm+" while in feet is "+ heightfeet+" and inches is " + String.format("%.2f", heightinch));

    }
    
}
