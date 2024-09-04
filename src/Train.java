public class Train {
    private String trainNumber;
    private String trainName;
    private int totalSeats;
    private boolean[] seats;

    public Train(String trainNumber, String trainName, int totalSeats) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.totalSeats = totalSeats;
        this.seats = new boolean[totalSeats];
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public boolean[] getSeats() {
        return seats;
    }
    
    public int getAvailableSeats() {
        int count = 0;
        for (boolean seat : seats) {
            if (!seat) count++;
        }
        return count;
    }

    public boolean bookSeat(int seatNumber) {
        if (!seats[seatNumber - 1]) {
            seats[seatNumber - 1] = true;
            return true;
        }
        return false;
    }

    public boolean cancelSeat(int seatNumber) {
        if (seats[seatNumber - 1]) {
            seats[seatNumber - 1] = false;
            return true;
        }
        return false;
    }
}
