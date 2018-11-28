import org.junit.Before;
import org.junit.Test;
import rides.Dodgems;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {
   rides.Dodgems dodgems;

   @Before
   public void before(){
        dodgems = new Dodgems("The Murdercars");
   }

   @Test
    public void canGetRideName(){
       assertEquals("The Murdercars",dodgems.getName());
   }
}
