package phase2.Filter;
import phase2.Model.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import phase2.Repository.CustomerRepository;
import phase2.Repository.InLineCustomer;

@RestController
public class Authentication {

    private CustomerRepository customerDB = new InLineCustomer();
    public static Customer ActiveCustomer ;


    @PostMapping("/login")
    public String Login(@RequestBody Customer customer) {
        String email = customer.getEmail();
        String password = customer.getPassword();
        Customer obj = customerDB.findCustomerByEmailAndPassword(email, password) ;
        if ( obj != null) {
            String name = obj.getName();
            ActiveCustomer = obj ;
            return "success" + "," + name + " is logged in";
        }
            return "sorry, wrong email or password";
     }


    @PostMapping("/signup")
    public String SignUp(@RequestBody Customer customer) {

        String name = customer.getName();
        String email = customer.getEmail();
        String password = customer.getPassword();

        Customer obj = customerDB.findCustomerByEmail(email) ;
        if ( obj == null) {
            customerDB.addCustomer(customerDB.getNewCustomerId(), name, email, password, 0);
            return "success, " + name + " is signed up successfully";
        } else {
            return "sorry, this email is already used";
        }
    }

    @PostMapping("/logout")
    public String logout() {
        return "success, you are logged out";
    }


    public void setCustomerDB(InLineCustomer customerDB) {
        this.customerDB = customerDB;
    }
}
