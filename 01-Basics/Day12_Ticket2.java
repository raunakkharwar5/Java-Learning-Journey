public class Day12_Ticket2 {
    String movieName;
    int seatNo;
    double price;

    Day12_Ticket2(String movieName, int seatNo, double price) {
        this.movieName = movieName;
        this.seatNo = seatNo;
        this.price = price;
    }

    void show() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat No: " + seatNo);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Day12_Ticket2 t1 = new Day12_Ticket2("Pushpa 2", 12, 250);

        t1.show();
    }
}