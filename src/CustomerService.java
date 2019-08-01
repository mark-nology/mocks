public class CustomerService {

    // in the test customerDB will be mocked
    private CustomerDB customerDB;

    public boolean addCustomer(Customer customer){
        if(customerDB.customerExists(customer)){
            return false;
        }
        return customerDB.save(customer);
    }
}