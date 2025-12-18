import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int radius =sc.nextInt();
        double area=3.14*Math.pow(radius,2);

        System.out.println("The area of circle is "+area);


    }
    

    
}
