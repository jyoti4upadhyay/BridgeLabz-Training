import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;


class Rate{
    public String transform(String a,String b){
        String str=a+" "+b;
        return str;
    }
    public String transform(double a,String b){
        String str=a+" "+b;
        return str;

    }
    public double transform(double a,double b){
        return a+b;
    }
}
public  class ExchangeRateRounding{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Rate rate=new Rate();
        double localCurrency=sc.nextDouble();
        double forenigncurrency=sc.nextDouble();
        String local=sc.next();
        String foreign=sc.next();
        double result=rate.transform(localCurrency,forenigncurrency);
        BigDecimal bg=new BigDecimal(result);
        System.out.println(bg.setScale(2,RoundingMode.HALF_UP));
        System.out.println(rate.transform(localCurrency,foreign));
        System.out.println(rate.transform(local,foreign));
    }
}