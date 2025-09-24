package phase2.Services.NotificationService;

import phase2.Model.Customer;
import phase2.Model.Product;

public class NewItemMessage implements IMessage {
    @Override
    public String CreateMessage(Customer c, Product p) {
        String CustomerName=c.getName();
        String ProductName=p.getName();
        String message="Dear "+CustomerName+ " a "+ProductName+" has been added to the store ";
        return message;
    }
}
