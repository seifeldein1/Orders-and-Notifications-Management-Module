package phase2.Services.NotificationService;

import phase2.Model.Product;
import phase2.Repository.InLineCustomer;

public class NewItemNotification extends NotificationObserver {

    @Override
    public void notify(Product P) {
        for (var customer: InLineCustomer.customers){
            NotificationQueue.add(customer.SendMessage("NewItemMessage",P));
        }
    }
}
