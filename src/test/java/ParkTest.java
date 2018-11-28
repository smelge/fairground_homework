import org.junit.Before;
import org.junit.Test;
import rides.Park;

import static org.junit.Assert.assertEquals;

public class ParkTest {
    rides.Park park;

    @Before
    public void before(){
        park = new Park("Lovely Field");
    }

    @Test
    public void canGetRideName(){
        assertEquals("Lovely Field",park.getName());
    }
}
