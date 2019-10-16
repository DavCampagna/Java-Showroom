import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryTest {

    Factory factory;
    Car car;

    @Before
    public void before() {
        factory = new Factory("Ford");
    }

    @Test
    public void hasName(){
        assertEquals("Ford", factory.getName());
    }

    @Test
    public void hasZeroStock(){
        assertEquals(0, factory.getStockCount());
    }

    @Test
    public void canFabricateCar(){
        factory.fabricateCar("Fiesta", 14000, 16000);
        assertEquals(1, factory.getStockCount());
    }
}
