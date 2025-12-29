import java.util.Scanner;
public class TicketBookingApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true) { 
            System.out.println("Enter Movie Type(2D/3D/IMAX)");
            String movieType=sc.next();
            int ticketprice=0;
            int totalPrice=0;

            switch(movieType.toUpperCase()){
                case "2D":
                    ticketprice=250;
                    break;
                case "3D":
                    ticketprice=1000;
                    break;
                case "IMAX":
                    ticketprice=3000;
                    break;
                default:
                    System.out.println("You have entered a wrong movie type");
                    break;
            }
            System.out.println("Enter Your SeatType (gold/silver)");
            String seatType=sc.next();
            if(seatType.equalsIgnoreCase("Gold")){
                ticketprice=ticketprice+500;
            }
            else if(seatType.equalsIgnoreCase("Silver")){
                ticketprice=ticketprice+200;
            }
            else{
                System.out.println("You entered the Wrong Choice");
                ticketprice=ticketprice+0;
            }
            totalPrice=ticketprice;

            System.out.println("Enter Your Choice in Snacks");
            System.out.println("1. PopCorn (100Rs)");
            System.out.println("2. ColdDrink (80Rs)");
            System.out.println("3. Nachos (50Rs)");
            System.out.println("4. Combo(popcorn+Drink)(150Rs)");

            String snacks=sc.next();
            switch(snacks.toLowerCase()){
                case "popcorn":
                    totalPrice=totalPrice+100;
                    break;
                case "colddrink":
                    totalPrice+=80;
                    break;
                case "nachos":
                    totalPrice+=50;
                    break;
                case "combo":
                    totalPrice+=150;
                    break;
                default:
                    System.out.println("Snack not available");
                    break;
            }
            System.out.println("Your TotalPrice is "+totalPrice+"Rs");
            
        }

        
        
    }

    
}
