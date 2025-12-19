import java.util.Scanner;

public class CountDownForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numcounter=sc.nextInt();
        for(int i=numcounter;i>=1;i--){
            System.err.println(i);
        }
        
    }
   
    
}
