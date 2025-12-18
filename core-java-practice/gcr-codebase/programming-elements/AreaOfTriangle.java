import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double basecm=sc.nextDouble();
        double heightcm=sc.nextDouble();
        double areaOfTrianglecm=0.5*basecm*heightcm;
        double areaSqInches=areaOfTrianglecm/(2.54 * 2.54);

        System.out.println("The Area of the triangle in sq inches is "+areaSqInches+" and sq cm is "+ areaOfTrianglecm);

        
    }
    
}
