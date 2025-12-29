import java.util.Scanner;
public class BusTracker {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int totalDistance=0;
        boolean stop=true;
        while(stop==true){
            totalDistance+=20; //20 km distance between stop to stop
            System.out.println("Is this your stop (yes/no)");
            String str=sc.next();
            if(str.equalsIgnoreCase("yes")){
                stop=false;
            }
            else{
                stop=true;
            }

        }
        System.out.println(totalDistance);
    }
    
}
