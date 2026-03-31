import java.util.Scanner;

public class CheckMultiplesWhile {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();

        if(num<=0 || num>=100){
            System.err.println("Please input number below 100");

        }
        else{ 
            int i=99;
            while(i >= 1) {
                if (num%i == 0) {
                    System.out.println(i);
                }
                i--;
            }
            

        }
    
        
    }
   
}

