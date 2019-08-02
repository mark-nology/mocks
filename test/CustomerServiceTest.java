import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerServiceTest {

    @Mock
    CustomerDB customerDBMock;

    @InjectMocks
    CustomerService service;

    @BeforeEach
    public void setup(){
        System.out.println("in CustomerServiceTest.setup");
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddCustomer() {
        System.out.println("in CustomerServiceTest.testAddCustomer");
        when(customerDBMock.save(any(Customer.class))).thenReturn(true);
        Customer customer = new Customer();
        assertTrue( service.addCustomer(customer) );
    }
}



