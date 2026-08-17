import java.util.Scanner;
public class NullException {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        String str=null;

        try {
            System.out.println(str.length());
            
        } catch (NullPointerException e) {
            System.err.println("String is null");
        }

    }
    
}
