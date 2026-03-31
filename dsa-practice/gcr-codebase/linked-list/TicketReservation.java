
public class TicketReservation{
    static class Node {
        int ticketId;
        String customerName, movieName, seatNumber, bookingTime;
        Node next;

        Node(int id, String customer, String movie, String seat, String time) {
            ticketId = id;
            customerName = customer;
            movieName = movie;
            seatNumber = seat;
            bookingTime = time;
        }
    }

    Node head = null;

    void addTicket(int id, String customer, String movie, String seat, String time) {
        Node newnode = new Node(id, customer, movie, seat, time);
        if (head == null) {
            head = newnode;
            newnode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = newnode;
            newnode.next = head;
        }
    }

    void removeTicket(int id) {
        if (head == null) return;
        if (head.ticketId == id && head.next == head) {
            head = null;
            return;
        }
        Node temp = head, prev = null;
        do {
            if (temp.ticketId == id) {
                if (prev != null) prev.next = temp.next;
                else {
                    Node last = head;
                    while (last.next != head) last = last.next;
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Node temp = head;
        do {
            System.out.println("TicketID: " + temp.ticketId + ", Customer: " + temp.customerName + ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByCustomer(String name) {
        if (head == null) return;
        Node temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                System.out.println("Ticket found: " + temp.ticketId);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No ticket found for customer " + name);
    }

    void searchByMovie(String movie) {
        if (head == null) return;
        Node temp = head;
        boolean found = false;
        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                System.out.println("Ticket for movie: " + temp.ticketId);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No ticket found for movie " + movie);
    }

    int countTickets() {
        if (head == null) return 0;
        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public static void main(String[] args) {
        TicketReservation tr = new TicketReservation();
        tr.addTicket(1, "Alice", "Movie A", "A1", "10:00 AM");
        tr.addTicket(2, "Bob", "Movie B", "B2", "12:00 PM");
        tr.addTicket(3, "Charlie", "Movie A", "A2", "10:00 AM");
        tr.displayTickets();
        tr.searchByCustomer("Alice");
        tr.searchByMovie("Movie A");
        tr.removeTicket(2);
        tr.displayTickets();
        System.out.println("Total tickets: " + tr.countTickets());
    }
}

