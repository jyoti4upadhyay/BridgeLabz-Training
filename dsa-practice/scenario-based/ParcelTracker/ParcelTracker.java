class ParcelTracker {

    private ParcelStatus head;

    // Add stage at end
    public void addStatus(String stage) {
        ParcelStatus newNode = new ParcelStatus(status);

        if (head == null) {
            head = newNode;
            return;
        }

        ParcelStatus temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addCheckpoint(String existingStatus, String newStatus) {
        ParcelStatus temp = head;

        while (temp != null) {
            if (temp.status.equals(existingStatus)) {
                ParcelStatus chkpoint = new ParcelStatus(newStatus);
                chkpoint.next = temp.next;
                temp.next = chkpoint;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found: " + existingStatus);
    }

    // Track parcel forward
    public void trackParcel() {
        ParcelStatus temp = head;

        if (temp == null) {
            System.out.println("Parcel lost or tracking unavailable.");
            return;
        }

        System.out.println("Parcel Tracking:");
        while (temp != null) {
            System.out.print(temp.status);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}