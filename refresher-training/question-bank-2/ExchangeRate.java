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
public  class ExchangeRate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Rate rate=new Rate();
        double localCurrency=sc.nextDouble();
        double forenigncurrency=sc.nextDouble();
        String local=sc.next();
        String foreign=sc.next();
        double result=rate.transform(localCurrency,forenigncurrency);
        System.out.printf("%.2f",result);
        System.out.println();
        System.out.println(rate.transform(localCurrency,foreign));
        System.out.println(rate.transform(local,foreign));
    }
}