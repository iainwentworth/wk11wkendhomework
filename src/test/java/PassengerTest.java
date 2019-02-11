import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("John", 5);
    }

    @Test
    public void passengerHasName() {
        assertEquals("John", passenger.getName());
    }

    @Test
    public void passengerHasNumberOfBags() {
        assertEquals(5, passenger.getNumberOfBags());
    }
}
