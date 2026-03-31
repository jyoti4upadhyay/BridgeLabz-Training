import java.util.Scanner;

public class Collinear{

    // slope formula
    public static boolean CollinearBySlope(
            int x1, int y1,
            int x2, int y2,
            int x3, int y3) {

        return (y2 - y1) * (x3 - x1) ==
               (y3 - y1) * (x2 - x1);
    }

   
    public static boolean CollinearByArea(
            int x1, int y1,
            int x2, int y2,
            int x3, int y3) {

        double area = 0.5 * (
                x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2)
        );

        return area == 0;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of point A (x1 y1):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter coordinates of point B (x2 y2):");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter coordinates of point C (x3 y3):");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        boolean slope_result = CollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean area_result = CollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\nUsing Slope");
        if (slope_result)
            System.out.println("The points are collinear");
        else
            System.out.println("The points are NOT collinear");

        System.out.println("\nUsing Area");
        if (area_result)
            System.out.println("The points are collinear");
        else
            System.out.println("The points are NOT collinear");
    }
}
