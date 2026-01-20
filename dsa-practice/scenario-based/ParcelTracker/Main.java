public class Main {

    public static void main(String[] args) {

        ParcelTracker tracker = new ParcelTracker();

        tracker.addStatus("Packed");
        tracker.addStatus("Shipped");
        tracker.addStatus("In Transit");
        tracker.addStatus("Delivered");

        tracker.addCheckpoint("Shipped", "At Warehouse");

        tracker.trackParcel();
    }
}
