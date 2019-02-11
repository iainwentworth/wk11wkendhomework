import com.sun.xml.internal.fastinfoset.tools.PrintTable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasPlaneCapacity() {
        assertEquals(416, plane.getPlaneType().getCapacity());
    }

    @Test
    public void hasPlaneWeight() {
        assertEquals(100000, plane.getPlaneType().getWeight());
    }
}
