import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TrainBookingSystem system = new TrainBookingSystem();

        // Sample Data
        system.addTrain(new Train("001", "Express Train", 10));
        system.addTrain(new Train("002", "Fast Train", 15));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Display Available Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Cancel a Booking");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Train Number: ");
                    String trainNum = scanner.nextLine();
                    system.displayAvailableSeats(trainNum);
                    break;
                case 2:
                    System.out.print("Enter Passenger Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Train Number: ");
                    trainNum = scanner.nextLine();
                    System.out.print("Enter Seat Number: ");
                    int seatNum = scanner.nextInt();
                    system.bookSeat(name, trainNum, seatNum);
                    break;
                case 3:
                    System.out.print("Enter Train Number: ");
                    trainNum = scanner.nextLine();
                    System.out.print("Enter Seat Number: ");
                    seatNum = scanner.nextInt();
                    system.cancelBooking(seatNum, trainNum);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}
