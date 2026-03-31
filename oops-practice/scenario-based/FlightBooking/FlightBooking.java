import java.util.*;
public class FlightBooking{

    // Array to store available flights
    static Flight[] flights = {
            new Flight(1034, "Delhi", "Mumbai",9000),
            new Flight(1002, "Delhi", "Bangalore",10000),
            new Flight(1035, "Mumbai", "Chennai",8900),
            new Flight(1024, "Pune", "Delhi",5000)
    };

    // List to store bookings
    static List<FlightBooking> bookings = new ArrayList<>();
    static int bookingCount = 1;

    // Search Flights
    public static void searchFlights(String source, String destination) {
        boolean finddestiny = false;

        for (Flight f : flights) {
            if (f.source.equalsIgnoreCase(source)
                    && f.destination.equalsIgnoreCase(destination)) {
                f.displayFlight();
                finddestiny= true;
            }
        }

        if (!finddestiny) {
            System.out.println("No flights found!");
        }
    }

    //Book Flight
    public static void bookFlight(int flightId, String passengerName) {
        for (Flight f : flights) {
            if (f.flightId == flightId) {
                Booking booking = new Booking(bookingCount++, f, passengerName);
                bookings.add(booking);
                System.out.println("Flight booked successfully!");
                return;
            }
        }
        System.out.println("Invalid Flight ID!");
    }

    //View Bookings
    public static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        for (Booking bk : bookings) {
            bk.displayBooking();
        }
    }

    //Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Search Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Source: ");
                    String src = sc.nextLine();
                    System.out.print("Enter Destination: ");
                    String dest = sc.nextLine();
                    searchFlights(src, dest);
                    break;

                case 2:
                    System.out.print("Enter Flight ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();
                    bookFlight(id, name);
                    break;

                case 3:
                    viewBookings();
                    break;

                case 4:
                    System.out.println("Thank you");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
