package phase2.Repository;
import phase2.Model.*;

public interface CustomerRepository {

    public void addCustomer(int customerId, String name, String email, String password, double balance);

    public void updateCustomer(int customerId, String name, String email, String password, double balance);

    public void deleteCustomer(int id);

    public void listCustomer();

    public Customer searchCustomer(int id);

    public Customer findCustomerByEmail(String email);

    public Customer findCustomerByEmailAndPassword(String email, String password);

    public int getNewCustomerId();

}
