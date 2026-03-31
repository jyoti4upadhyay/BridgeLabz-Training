import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=false;
                break;
            }

        }
        if(flag){
            System.out.println("prime number");

        }
        else{
            System.out.println("Not a prime number");
        }
        

    }
    
}
