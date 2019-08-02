public class CustomerDB {
    public boolean customerExists(Customer customer){
        System.out.println("    in CustomerDB.customerExists");
        // some logic
        return false;
    }

    public boolean save(Customer customer) {
        System.out.println("    in CustomerDB.save");
        // use http etc to save the customer in the remote database
        // if save unsuccessful return false, else
        return true;
    }
}
