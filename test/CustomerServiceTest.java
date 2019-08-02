import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerServiceTest {

    public CustomerService service;

    @BeforeEach
    public void setup(){
        System.out.println("in CustomerServiceTest.setup");
        service = new CustomerService(new CustomerDB());
    }

    @Test
    public void testAddCustomer() {
        System.out.println("in CustomerServiceTest.testAddCustomer");
        Customer customer = new Customer();
        assertTrue( service.addCustomer(customer) );
    }
}

