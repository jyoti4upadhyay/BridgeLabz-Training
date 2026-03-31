import java.util.Scanner;
public class CheckMultiples {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();

        if(num<=0 || num>=100){
            System.err.println("Please input number below 100");

        }
        else{ 
            for (int i = 99; i >= 1; i--) {
                if (num%i == 0) {
                    System.out.println(i);
                }
            }
            

        }
    
        
    }
   
}
