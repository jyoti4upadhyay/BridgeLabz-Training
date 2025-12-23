import java.util.Scanner;
public class ArrayIndexOutOfBound {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String size");
        int size=sc.nextInt();
        String[] str =new String[size];
        for(int i=0;i<size;i++){
            str[i]=sc.next();
        }

        try {
            System.out.println("Enter your index");
            int index=sc.nextInt();
            System.err.println(str[index]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter the index within the range");
        }




    }

    
}
