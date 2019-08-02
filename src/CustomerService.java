public class CustomerService {

    // in the test customerDB will be mocked
    private CustomerDB customerDB;

    // constructor, note how customerDB is being injected
    public CustomerService(CustomerDB customerDB) {
        System.out.println("  in CustomerService constructor, injecting customerDB");
        this.customerDB = customerDB;
    }

    public boolean addCustomer(Customer customer){
        System.out.println("  in CustomerService.addCustomer");
        if(customerDB.customerExists(customer)){
            return false;
        }
        return customerDB.save(customer);
    }
}