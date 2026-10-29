public class Day11_Ticket {
    static int counter = 101; // sabke liye same
    String ticketId;
    String issue;
    String priority;
    String status;

    Day11_Ticket(String issue, String priority) {
        this.ticketId = "TICK-" + counter;
        counter++; // next ticket ke liye 102 ho jayega
        this.issue = issue;
        this.priority = priority;
        this.status = "Open";
    }

    void closeTicket() {
        status = "Closed";
        System.out.println(ticketId + " closed.");
    }

    void display() {
        System.out.println(ticketId + " | " + issue + " | " + priority + " | " + status);
    }

    public static void main(String[] args) {
        Day11_Ticket t1 = new Day11_Ticket("Login not working", "High");
        Day11_Ticket t2 = new Day11_Ticket("Fee not updated", "Low");

        t1.display();
        t2.display();

        t1.closeTicket();
        t1.display();
    }
}