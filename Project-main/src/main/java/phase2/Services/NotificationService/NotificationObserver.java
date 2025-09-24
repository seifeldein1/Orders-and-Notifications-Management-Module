package phase2.Services.NotificationService;

import phase2.Model.Product;

import java.util.ArrayList;

public abstract class NotificationObserver {  //observer

    public static ArrayList<String> NotificationQueue = new ArrayList<>();

    public abstract void notify(Product P);

    public ArrayList<String> PrintQueue(){
        return NotificationQueue;
    }
    public void CLR(){
        NotificationQueue.clear();
    }

}
