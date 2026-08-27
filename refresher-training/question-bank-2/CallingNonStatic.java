import java.util.*;

class Calculate{
    public int divideNumber(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Division is not possible");
        }
        else{
        return a/b;
        }
    }
}
public class  CallingNonStatic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        Calculate cal=new Calculate();
        System.out.println(cal.divideNumber(num1, num2));
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }
    }
    
}
