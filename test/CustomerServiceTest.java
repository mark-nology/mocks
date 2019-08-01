import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerServiceTest {

    @Mock
    private CustomerDB customerDBMock;

    @InjectMocks
    private CustomerService service;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddCustomer() {

        // specify customerDB to mocks the save operation
        when(customerDBMock.save(any(Customer.class))).thenReturn(true);

        Customer customer = new Customer();

        // mock used when testing CustomerService's addCustomer method
        assertTrue( service.addCustomer(customer) );
    }
}

