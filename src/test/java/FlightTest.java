import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FR756", "GLA", "EDI", "1430");
        passenger1 = new Passenger("John", 4);
        passenger2 = new Passenger("Iain", 6);
    }

    @Test
    public void numberOfAvailableSeats() {
        assertEquals(416, flight.getAvailableSeats());
    }

    @Test
    public void bookAPassengerOntoFlight() {
        flight.bookAPassenger(passenger1);
        assertEquals(1, flight.getNumberOfPassengers());
        assertEquals(415, flight.getAvailableSeats());
    }
}
