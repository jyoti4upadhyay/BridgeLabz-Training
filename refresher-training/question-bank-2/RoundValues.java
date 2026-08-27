import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
public class RoundValues {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        double value1=sc.nextDouble();
        double value2 =sc.nextDouble();
        BigDecimal num1=new BigDecimal(value1);
        BigDecimal num2=new BigDecimal(value2);
        BigDecimal result=num1.add(num2).setScale(2,RoundingMode.HALF_UP);
        System.out.println(result);

    }
    
}
