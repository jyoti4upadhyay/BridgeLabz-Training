
public class ParcelStatus{
    String status;
    ParcelStatus next;

    ParcelStatus(String status) {
        this.status= status;
        this.next = null;
    }
}