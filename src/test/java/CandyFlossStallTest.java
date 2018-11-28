import org.junit.Before;
import org.junit.Test;
import stalls.CandyFlossStall;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {
    stalls.CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Flossatorium","George Bovril",35);
    }

    @Test
    public void canGetStallName(){
        assertEquals("Flossatorium",candyFlossStall.getStallName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("George Bovril",candyFlossStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(35,candyFlossStall.getParkingSpot());
    }
}
