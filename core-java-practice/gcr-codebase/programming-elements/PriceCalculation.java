import java.util.Scanner;
public class PriceCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double unitprice=sc.nextInt();
        int quantity=sc.nextInt();
        double totalprice=unitprice*quantity;
        System.out.println("The total purchase price is INR "+totalprice+" if the quantity "+ quantity +" and unit price is INR "+ unitprice);
        
    }
   
}
