import java.util.Scanner;
public class StringIndexOutOfBound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String str=sc.nextLine();
        System.out.println("Enter your Index");
        int index=sc.nextInt();

        

        try {
            char str2=str.charAt(index);
            System.out.println(str2);
            
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Enter valid index as this string length is "+str.length());
        }
        
    }
    
}
