import org.junit.Before;
import org.junit.Test;
import rides.Rollercoaster;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    rides.Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Rapid Whizzer");
    }

    @Test
    public void canGetRideName(){
        assertEquals("Rapid Whizzer",rollercoaster.getName());
    }
}
