
import java.util.Scanner;

public class HandshakeCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalStudent=sc.nextInt();
        int totalHandshake=(totalStudent*(totalStudent-1))/2;
        System.out.println(" The total number of possible handshakes "+totalHandshake);


        
    }
    
}
