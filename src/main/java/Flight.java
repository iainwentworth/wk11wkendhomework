import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flight_number;
    private String destination_airport;
    private String departure_airport;
    private String departure_time;

    public Flight(Plane plane, String flight_number, String destination_airport, String departure_airport, String departure_time) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flight_number = flight_number;
        this.destination_airport = destination_airport;
        this.departure_airport = departure_airport;
        this.departure_time = departure_time;
    }

    public int getAvailableSeats() {
        return plane.getPlaneType().getCapacity() - passengers.size();
    }

    public void bookAPassenger(Passenger passenger) {
        if (this.getAvailableSeats() >= 1){
            this.passengers.add(passenger);
        }
    }

    public int getNumberOfPassengers() {
        return passengers.size();
    }
}