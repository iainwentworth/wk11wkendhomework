import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        passenger1 = new Passenger("John", 4);
        passenger2 = new Passenger("Iain", 6);
        flight = new Flight(plane, "FR756", "GLA", "EDI", "1430");
        flight.bookAPassenger(passenger1);
        flight.bookAPassenger(passenger2);
        flightManager = new FlightManager(flight);
    }


    @Test
    public void bagageWeightAllocationPerPassenger() {
        assertEquals(25000, flightManager.getBaggageWeightAllocationPerPassanger());
    }
}
