public class EarthVolume {
    public static void main(String[] args) {
        int radius=6378;
        double volkm=(4/3)*3.14* Math.pow(radius,3);
        double milesvol=volkm*0.621371;
        System.out.println("The volume of earth in cubic kilometers is "+String.format("%.2f",volkm) +" and cubic miles is "+ String.format("%.2f",milesvol));

    }
    
}
