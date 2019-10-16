import models.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car1;

    @Before
    public void before(){
        car1 = new Car("Ford", "Fiesta", 14000, 16000);
    }

    @Test
    public void hasMakeName(){
        assertEquals("Ford", car1.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Fiesta", car1.getModel());
    }

    @Test
    public void hasFactoryPrice(){
        assertEquals(14000, car1.getFactoryPrice());
    }

    @Test
    public void hasCustomerPrice(){
        assertEquals(16000, car1.getCustomerPrice());
    }
}
