
import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("Choose Your Coffee");
            System.out.println("1 :Espresso");
            System.out.println("2 :Latte");
            System.out.println("3 :Cappuccino");
            System.out.println("4 :Mocha");
            System.out.println("5 :Iced Coffee");
            
            System.out.println("Enter your choice from 1-5");
            int input=sc.nextInt();

            int choice=input;
            int price=0;
            
            switch ( choice ){
                case 1:
                    System.out.println("You ordered Espresso");
                    price =220;
                    break;
                case 2:
                    System.out.println("You ordered Latte");
                    price =230;
                    break;
                case 3:
                    System.out.println("You ordered Cappuccino");
                    price =500;
                    break;
                case 4:
                    System.out.println("You ordered Mocha");
                    price =900;
                    break;
                case 5:
                    System.out.println("You ordered Iced Coffee");
                    price =250;
                    break;
                default:
                    System.err.println("Invalid Choice!!");
                    break;
            }
            //GST on coffee is 5% 
            System.out.println("Enter your Quantity");
            int qty=sc.nextInt();

            int bill=price*qty;
            int gst =( bill * 5)/100;  // (bill *gst%) /100;  
            int totalbill=bill+gst;

            System.out.println("Thanks for your Order.Your TotalBill is "+totalbill+"Rs");



        }
    }
    
}
