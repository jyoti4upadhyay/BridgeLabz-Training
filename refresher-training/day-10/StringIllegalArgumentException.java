import java.util.Scanner;
public class StringIllegalArgumentException {
    public static void main(String[] args) {
        System.err.println("Enter your string");
        Scanner  sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Enter your Starting index and ending index");
        int startIndex=sc.nextInt();
        int endIndex=sc.nextInt();


        try {
            String substr=str.substring(startIndex,endIndex);
            System.err.println(substr);
            
        }catch (java.lang.IllegalArgumentException e) {
            System.err.println("stating index is greater than ending index");
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Enter index within the range as string length is"+str.length());
        }

    }
    
}

