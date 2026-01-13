 class Ticket {
    String eventName;
    private double price;

    public Ticket(String eventName, double  price) {
        this.eventName = eventName;
        this.price= price;
    }  
    public double getPrice() {
        return price;
    }
}
