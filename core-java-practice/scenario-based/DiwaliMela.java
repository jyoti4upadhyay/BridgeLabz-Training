import java.util.Scanner;

public class DiwaliMela {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) { 
            System.out.println("Enter you number");
            long num=sc.nextInt();
            if(num<=0){
                System.out.println("Invalid Input");
                continue;
            }
            else{
                if(num%3==0 && num%5==0){
                    System.out.println("You Won the price");
                }
                else{
                    System.out.println("Better Luck NextTime");
                }
            }
        }

        
    }
    
}
