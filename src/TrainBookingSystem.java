import java.util.ArrayList;

public class TrainBookingSystem {
    private ArrayList<Train> trains;
    private ArrayList<Booking> bookings;

    public TrainBookingSystem() {
        trains = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    public void displayAvailableSeats(String trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber().equals(trainNumber)) {
                System.out.println("Available seats for " + train.getTrainName() + ":");
                for (int i = 0; i < train.getSeats().length; i++) {
                    if (!train.getSeats()[i]) {
                        System.out.print((i + 1) + " ");
                    }
                }
                System.out.println();
                return;
            }
        }
        System.out.println("Train not found.");
    }

    public boolean bookSeat(String passengerName, String trainNumber, int seatNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber().equals(trainNumber)) {
                if (train.bookSeat(seatNumber)) {
                    bookings.add(new Booking(passengerName, trainNumber, seatNumber));
                    System.out.println("Seat booked successfully.");
                    return true;
                } else {
                    System.out.println("Seat is already booked.");
                    return false;
                }
            }
        }
        System.out.println("Train not found.");
        return false;
    }

    public boolean cancelBooking(int seatNumber, String trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber().equals(trainNumber)) {
                if (train.cancelSeat(seatNumber)) {
                    bookings.removeIf(b -> b.getSeatNumber() == seatNumber && b.getTrainNumber().equals(trainNumber));
                    System.out.println("Booking canceled successfully.");
                    return true;
                } else {
                    System.out.println("Seat was not booked.");
                    return false;
                }
            }
        }
        System.out.println("Train not found.");
        return false;
    }
}
