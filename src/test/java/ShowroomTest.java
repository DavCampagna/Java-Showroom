import models.Showroom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShowroomTest {

    Showroom showroom;

    @Before
    public void before(){
        showroom = new Showroom("Davide's Wheels");
    }

    @Test
    public void hasName(){
        assertEquals("Davide's Wheels", showroom.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(250000, showroom.getTill());
    }

    @Test
    public void hasSelection(){
        assertEquals(0, showroom.getSelectionCount());
    }
}
