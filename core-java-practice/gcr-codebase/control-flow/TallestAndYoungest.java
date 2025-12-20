import java.util.Scanner;

public class TallestAndYoungest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter Height");
        int amarHeight=sc.nextInt();
        int akbarHeight=sc.nextInt();
        int anthonyHeight=sc.nextInt();
        System.err.println("Enter Age");
        int amarAge=sc.nextInt();
        int akbarAge=sc.nextInt();
        int anthonyAge=sc.nextInt();
        if(amarAge<akbarAge && amarAge<anthonyAge){
            System.out.println("Amar is youngest");
        }
        else if (akbarAge<anthonyAge && akbarAge<amarAge){
            System.out.println("Akbar is youngest");
        }
        else{
            System.out.println("Anthony is youngest");
        }
        if(amarHeight>akbarHeight && amarHeight>anthonyHeight){
            System.out.println(" Amar is tallest");
        }
        else if (akbarHeight>amarHeight && akbarHeight>anthonyHeight){
            System.out.println("Akbar is tallest");
        }
        else{
            System.out.println("Anthony is tallest");
        }
        




        
    }

    
}
