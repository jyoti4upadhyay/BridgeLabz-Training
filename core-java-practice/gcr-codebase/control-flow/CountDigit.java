import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<=0){
            System.out.println("Enter positive number");

        }
        else{
            int count=0;
            while(num!=0){
                count++;
                num=num/10;
            }
            System.out.println(count);
        }
    }
    
}
