package phase2.Services.NotificationService;

import phase2.Model.Customer;

public class Email implements Channel {

    @Override
    public String Send(Customer C, String Message) {
        return ("send to this email "+C.getEmail()+" >>>> "+ Message);
    }
}
