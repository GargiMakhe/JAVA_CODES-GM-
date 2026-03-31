class TicketBooking {
    int available = 1;
    synchronized void book() { // Use synchronization[cite: 1]
        if (available > 0) {
            System.out.println("Ticket booked successfully");
            available--;
        } else {
            System.out.println("No tickets available");
        }
    }
}

public class RailwayReservation {
    public static void main(String[] args) {
        TicketBooking tb = new TicketBooking();
        new Thread(tb::book).start();
        new Thread(tb::book).start();
    }
}