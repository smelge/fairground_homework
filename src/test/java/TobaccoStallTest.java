import org.junit.Before;
import org.junit.Test;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {
    stalls.TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Now Banned","Creepy Guy in an Overcoat",0);
    }

    @Test
    public void canGetStallName(){
        assertEquals("Now Banned",tobaccoStall.getStallName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Creepy Guy in an Overcoat",tobaccoStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(0,tobaccoStall.getParkingSpot());
    }
}
