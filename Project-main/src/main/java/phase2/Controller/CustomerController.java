package phase2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import phase2.Filter.Authentication;
import phase2.Model.Product;
import phase2.Repository.InLineProduct;

import java.awt.*;
import java.util.ArrayList;

@RestController
public class CustomerController {
    InLineProduct productDB = new InLineProduct();
    @PostMapping("/addbalance")
    public String addbalance(@RequestParam double balance){
        Authentication.ActiveCustomer.addBalance(balance);
        return "A balance of " + balance + " is added successfuly" ;
    }

    @GetMapping("/getbalance")
    public double addbalance(){
        return  Authentication.ActiveCustomer.getBalance();
    }


    @GetMapping("/listAllproducts")
    public ArrayList<Product> ListAllProducts(){
        return productDB.listProduct();
    }

}
