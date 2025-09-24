package phase2.Services.NotificationService;

import phase2.Model.Customer;
import phase2.Model.Product;

public class ConfirmationNotification extends NotificationObserver {
    Customer obj;

    public ConfirmationNotification(Customer obj) {
        this.obj = obj;
    }

    @Override
    public void notify(Product P) {

        NotificationQueue.add(obj.SendMessage("Confirmation",P));
    }
}
