import java.util.Scanner;
public class Length {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int flag=0;
        int i=0;
        try {
            while (true) { 
                str.charAt(i);
                flag++;  
                i++;
            }
            
        } catch (StringIndexOutOfBoundsException e) {
        }
        int builtinlen=str.length();
        System.out.println(flag);
        System.out.println(builtinlen);
    }
    
}
