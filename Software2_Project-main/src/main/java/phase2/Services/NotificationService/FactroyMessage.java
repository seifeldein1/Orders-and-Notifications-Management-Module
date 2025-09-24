package phase2.Services.NotificationService;

import java.util.Objects;

public class FactroyMessage {
    public IMessage FindType(String type){
        if(Objects.equals(type, "NewItemMessage")){
            return  new NewItemMessage();
        }else{
            return  new OrderMessage();
        }
    }
}
