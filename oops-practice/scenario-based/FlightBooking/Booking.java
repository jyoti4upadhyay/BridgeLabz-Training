class Booking {
    int bookingId;
    String passengerName;

    public Booking(int bookingId,String passengerName) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
    }

    public void displayBooking() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Passenger: " + passengerName);
        flight.displayFlight();
    }
}
