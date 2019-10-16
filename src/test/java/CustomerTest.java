import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Ahmed", 22,20000);
    }

    @Test
    public void hasName(){
        assertEquals("Ahmed", customer.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(22, customer.getAge());
    }

    @Test
    public void hasWallet(){
        assertEquals(20000, customer.getWallet());
    }

    @Test
    public void hasOwnedCars(){
        assertEquals(0, customer.ownedCarsCount());
    }
}
