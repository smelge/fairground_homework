import org.junit.Before;
import org.junit.Test;
import rides.Playground;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    rides.Playground playground;

    @Before
    public void before(){
        playground = new Playground("The Pit");
    }

    @Test
    public void canGetRideName(){
        assertEquals("The Pit",playground.getName());
    }
}
