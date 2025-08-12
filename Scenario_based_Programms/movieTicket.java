import java.util.Scanner;

class MovieTicket {
    String movieName;
    int ticketCount;
    String seatType;
    int totalPrice;

    MovieTicket(String movieName, int ticketCount) {
        this(movieName, ticketCount, "Normal");
    }

    MovieTicket(String movieName, int ticketCount, String seatType) {
        this.movieName = movieName;
        this.ticketCount = ticketCount;
        this.seatType = seatType;
        int pricePerTicket = seatType.equalsIgnoreCase("VIP") ? 300 : 150;
        totalPrice = pricePerTicket * ticketCount;
    }

    void display() {
        System.out.println("Movie: " + movieName);
        System.out.println("Tickets: " + ticketCount);
        System.out.println("Seat Type: " + seatType);
        System.out.println("Total Price: ₹" + totalPrice);
    }
}

public class movieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String name = sc.nextLine();

        System.out.print("Enter ticket count: ");
        int count = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter seat type (Normal/VIP): ");
        String seat = sc.nextLine();

        MovieTicket ticket = new MovieTicket(name, count, seat);
        ticket.display();

        sc.close();
    }
}
