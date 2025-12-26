import java.util.*;
public class SimpleInterest {
    public static float calSimpleInterest(float  p,float r,float t){
        float si=(p*r*t)/100;
        return si;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal,rate and time respectively");
        float principal=sc.nextInt();
        float rate=sc.nextInt();
        float time=sc.nextInt();
        float SimpleInterest=calSimpleInterest(principal,rate,time);
        System.out.println("Simple Interest is "+SimpleInterest);
    }
    
}
