import java.util.*;

public class PositiveNegative {
    public String  checkInteger(int num){
        if(num>0){
            return "Positive";
        }
        else if(num<0){
            return  "Negative";

        }
        else{
            return "Zero";
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer number");
        int number=sc.nextInt();
        PositiveNegative res=new PositiveNegative();
        String  result=res.checkInteger(number);
        System.out.println("The number is "+result);

    }
    
}
