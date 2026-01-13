public class Flight {
    int flightId;
    String source;
    String destination;
    double fare;

    public Flight(int flightId, String source, String destination, double fare) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.fare =fare;
    }

    public void displayFlight() {
        System.out.println("Flight ID: " + flightId +
                ", From: " + source +
                ", To: " + destination +
                ", Price: ₹" + fare);
    }
}