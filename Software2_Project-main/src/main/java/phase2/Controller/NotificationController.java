package phase2.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import phase2.Model.Product;
import phase2.Services.NotificationService.*;

import java.util.ArrayList;

@RestController
public class NotificationController {

    NewItemNotification NewItemNotification = new NewItemNotification();


    @GetMapping ("/addnewitem")
    public ArrayList<String> AddNewItemToTheStore(@RequestBody Product newProduct){
        NotificationObserver.NotificationQueue.clear();
        /// add the product in the Queue of notifications
        NewItemNotification.notify(newProduct);
        /// display notification message for every customer in the system
        return  NewItemNotification.PrintQueue();
    }
}
