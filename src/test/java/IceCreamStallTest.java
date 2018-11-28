import org.junit.Before;
import org.junit.Test;
import stalls.IceCreamStall;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    stalls.IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Cold and Creamy","Leslie Butts",81);
    }

    @Test
    public void canGetStallName(){
        assertEquals("Cold and Creamy",iceCreamStall.getStallName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Leslie Butts",iceCreamStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(81,iceCreamStall.getParkingSpot());
    }
}
