import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlightUtil {

    static Map<String, FlightData> map = new HashMap<>();

    // Flight Number Validation
    public boolean validateFlightNumber(String flightNum)
            throws FlightException {

        if (!flightNum.matches("^FL-[0-9]{4}$")) {
            throw new FlightException("The flight number " + flightNum+ " is Invalid");
        }
        return true;
    }

    // Flight Name Validation
    public boolean validateFlightName(String flightName)
            throws FlightException {

        if (!map.containsKey(flightName)) {
            throw new FlightException(
                    "The flight name " + flightName + " is Invalid");
        }
        return true;
    }

    // Passenger Capacity Validation
    public boolean validatePassengerCount(int passengerCount, String flightName)
            throws FlightException {

        FlightData info = map.get(flightName);

        if (passengerCount > info.passenger) {
            throw new FlightException("Passenger count exceeds capacity: " + info.passenger );
        }
        return true;
    }

    // Fuel Capacity Validation
    public boolean validateFuel(int fuelReq, String flightName)
            throws FlightException {

        FlightData info = map.get(flightName);

        if (fuelReq > info.fuel) {
            throw new FlightException(
                    "Fuel exceeds capacity: " + info.fuel
            );
        }
        return true;
    }

    public static void main(String[] args) {

        
        map.put("AirIndia", new FlightData(396, 80000));
        map.put("Vistara", new FlightData(615, 120000));
        map.put("IndiGo", new FlightData(230, 60000));

        try (Scanner in = new Scanner(System.in)) {

            String ip = in.nextLine();
            String[] arr = ip.split(":");

            FlightUtil obj = new FlightUtil();

            obj.validateFlightNumber(arr[0]);
            obj.validateFlightName(arr[1]);
            obj.validatePassengerCount(Integer.parseInt(arr[2]), arr[1]);

            System.out.println("Flight validated successfully");

        } catch (FlightException e) {
            System.out.println("Exception Found: " + e.getMessage());
        }
    }
}