package phase2.Services.NotificationService;

public class FactoryChannel {
    public Channel CreateChannel(boolean Contact){
        if(Contact){
            return  new Email();
        }else{
            return  new SMS();
        }
    }
}
