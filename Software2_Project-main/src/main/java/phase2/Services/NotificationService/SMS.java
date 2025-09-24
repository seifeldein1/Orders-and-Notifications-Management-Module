package phase2.Services.NotificationService;

import phase2.Model.Customer;

public class SMS implements Channel{
    @Override
    public String Send(Customer C, String Message) {
        return ("This IMessage send to this Number "+C.getNumber()+'\n'+Message);
    }
}
