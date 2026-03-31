import java.util.*;
// user class 
class User{
    String userId;
    String name;
    User(String userId,String name){
        this.userId=userId;
        this.name=name;
    }
} 
//Driver class 
class Driver{
    String driverName;
    String driverId;
    boolean available=true; //Assume driver is available

    Driver(String driverName,String driverId,boolean available){
        this.driverId=driverId;
        this.driverName=driverName;
        this.available=true;
    }

}
//Ride class 
class Ride{
    int rideId;
    double distance;
    double fare;
    Driver driverId;
    User userId;

    Ride(int rideId,double distance,double fare,Driver driverAssigned,User user){
        this.rideId=rideId;
        this.distance=distance;
        this.fare=fare;
        this.driverId=driverAssigned;
        this.userId=user;
    }
}

//FareCalculation
interface FareCal{
    static double calFare(double distance) {
        throw new UnsupportedOperationException("Unimplemented method 'calFare'");
    }
}
class NormalFareCal implements FareCal{
    public double calFare(double distance){
        double fare=distance*20; //20 per km;
        return fare;
    }

}
class PeakFareCal implements FareCal{
    public double calFare(double distance){
        double fare=distance*50; //50 per km
        return fare;
    }
}
//RideService
class RideService{
    private List<Driver> drivers=new ArrayList<>();
    private List<Ride> rides=new ArrayList<>();
    private int ridecount=1;
    public void addDriver(Driver driver){
        drivers.add(driver);
    }
    public Ride  bookRide(User user,double distance ,FareCal calfFare)throws NoDriverAvailableException{
        Driver driverAssigned=null;
        for(Driver d:drivers){
            if(d.available){
                driverAssigned=d;
                d.available=false;
                break;
            }
        }
        if(driverAssigned==null){
            throw new NoDriverAvailableException("NO Driver Available right now");
        }
        double totalFare=FareCal.calFare(distance);
        Ride ride=new Ride(ridecount++,distance,totalFare,driverAssigned,user);
        rides.add(ride);

        return ride;
    }
    public List<Ride> getPastRide(){
        return rides;
    }
}

class NoDriverAvailableException extends Exception{
    public NoDriverAvailableException(String message){
        super(message);
    }
}

public class CabBooking {
    public static void main(String[] args){
        RideService rs=new RideService();
        rs.addDriver(new Driver("Shyaam","001P",true));
        rs.addDriver(new Driver("Ram","003P",false));

        User user0=new User("008I","Jyoti");
        User user1=new User("678P","Vipul");

        FareCal normalfare=new NormalFareCal();
        FareCal peakfare=new PeakFareCal();

        try {
            Ride ride1=rs.bookRide(user0,45,peakfare);
            System.out.println("Ride booked");
            
            Ride ride2=rs.bookRide(user1,67,normalfare);
            System.out.println("Ride booked");
            
        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Past Drives");
        for(Ride r:rs.getPastRide()){
            System.out.println(r);
        }


    }
    
}
