package phase2.Services.NotificationService;

import phase2.Model.Customer;

public interface Channel {
    String Send(Customer C,String Message);
}
