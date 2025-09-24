package phase2.Services.NotificationService;

import phase2.Model.Customer;
import phase2.Model.Product;

public interface IMessage {
    public String CreateMessage(Customer c, Product p);
}
