import java.util.*;

public class Handshake {
    public int calHandshakes(int number){
        int handshakecal=(number*(number-1))/2;
        return handshakecal;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        Handshake res=new Handshake();
        int result=res.calHandshakes(num);

        System.out.println("Number of Handshakes is "+ result);

        
    }
    
}
