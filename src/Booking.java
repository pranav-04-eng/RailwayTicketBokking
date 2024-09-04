public class Booking {
    private String passengerName;
    private String trainNumber;
    private int seatNumber;

    public Booking(String passengerName, String trainNumber, int seatNumber) {
        this.passengerName = passengerName;
        this.trainNumber = trainNumber;
        this.seatNumber = seatNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "passengerName='" + passengerName + '\'' +
                ", trainNumber='" + trainNumber + '\'' +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
