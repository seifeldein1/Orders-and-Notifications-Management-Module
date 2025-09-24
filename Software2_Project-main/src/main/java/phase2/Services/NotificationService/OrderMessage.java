package phase2.Services.NotificationService;

import phase2.Model.Customer;
import phase2.Model.Product;

public class OrderMessage implements IMessage {

    @Override
    public String CreateMessage(Customer c, Product p) {
        String Cname = c.getName();
        String Pname = p.getName();
        String message= "Dear "+Cname+", your booking of the item "+ Pname +" is confirmed, thanks for using our store :)";
        return message;
    }
}
