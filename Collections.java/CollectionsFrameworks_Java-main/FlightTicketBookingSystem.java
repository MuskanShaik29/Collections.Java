import java.util.*;

class FlightTicket {
    private int ticketId;
    private String passengerName;
    private String destination;
    private int priority;

    public FlightTicket(int ticketId, String passengerName, String destination, int priority) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.destination = destination;
        this.priority = priority;
    }

    public int getTicketId() { return ticketId; }
    public String getPassengerName() { return passengerName; }
    public String getDestination() { return destination; }
    public int getPriority() { return priority; }

    @Override
    public String toString() {
        return "FlightTicket{" +
                "Ticket ID=" + ticketId +
                ", Passenger='" + passengerName + '\'' +
                ", Destination='" + destination + '\'' +
                ", Priority=" + priority +
                '}';
    }
}

class PriorityComparator implements Comparator<FlightTicket> {
    @Override
    public int compare(FlightTicket t1, FlightTicket t2) {
        return Integer.compare(t1.getPriority(), t2.getPriority());
    }
}

public class FlightTicketBookingSystem {
    public static void main(String[] args) {
        Queue<FlightTicket> ticketQueue = new LinkedList<>();
        PriorityQueue<FlightTicket> priorityQueue = new PriorityQueue<>(new PriorityComparator());

        
        FlightTicket t1 = new FlightTicket(101, "Alice", "New York", 3);
        FlightTicket t2 = new FlightTicket(102, "Bob", "Los Angeles", 1);
        FlightTicket t3 = new FlightTicket(103, "Charlie", "Chicago", 2);
        FlightTicket t4 = new FlightTicket(104, "David", "Miami", 4);

        ticketQueue.add(t1);
        ticketQueue.add(t2);
        ticketQueue.add(t3);
        ticketQueue.add(t4);

        priorityQueue.add(t1);
        priorityQueue.add(t2);
        priorityQueue.add(t3);
        priorityQueue.add(t4);

        
        System.out.println("Tickets in Queue Order:");
        while (!ticketQueue.isEmpty()) {
            System.out.println(ticketQueue.poll());
        }

        
        System.out.println("\nTickets in Priority Order:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
