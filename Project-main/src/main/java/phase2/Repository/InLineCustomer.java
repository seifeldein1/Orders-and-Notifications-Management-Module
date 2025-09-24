package phase2.Repository;

import phase2.Model.*;

import java.util.ArrayList;
import java.util.List;


public class InLineCustomer implements CustomerRepository {
    public static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1, "saif", "saifeldeen201770@gmail.com", "123", 1000));
        customers.add(new Customer(2, "zeyad", "zeyad@gamil.com", "123", 1000));
        customers.add(new Customer(3, "muhammed", "muhamed@gmail.com", "123", 1000));
        customers.add(new Customer(4, "amal", "amal@gmail.com", "123", 1000));
          }

    @Override
    public void addCustomer(int customerId, String name, String email, String password, double balance) {
        customers.add(new Customer(customerId, name, email, password , balance));
    }

    @Override
    public void updateCustomer(int customerId, String name, String email, String password, double balance) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) {
                customer.setName(name);
                customer.setEmail(email);
                customer.setPassword(password);
                customer.setBalance(balance);
            }
        }
    }


    @Override
    public void deleteCustomer(int id) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == id) {
                customers.remove(customer);
            }
        }

    }

    @Override
    public void listCustomer() {
        for (Customer customer : customers) {
            customer.Print();
        }

    }

    @Override
    public Customer searchCustomer(int id) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == id) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public Customer findCustomerByEmail(String email) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public Customer findCustomerByEmailAndPassword(String email, String password) {
        for (Customer customer : customers) {
            if (customer.getEmail().equals(email) && customer.checkPassword(password)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public int getNewCustomerId() {
        return customers.size() + 1;
    }


}
