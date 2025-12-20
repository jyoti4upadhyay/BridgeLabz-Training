
import java.util.Scanner;

public class LeapYearLogicalOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year<1582){
            System.out.println("Enter year again above 1582");
        }
        else{
            if((year%4==0 && year%100!=0)||(year%400==0)){
                System.out.println("It's a leap year");
            }
            else{
                System.out.println("Not a leap year");
            }
        }

    }
    
}