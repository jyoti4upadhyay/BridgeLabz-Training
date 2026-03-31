public class FlightException extends Exception {
    public FlightException(String message) {
        super("Invalid Flight Number");
    }
}