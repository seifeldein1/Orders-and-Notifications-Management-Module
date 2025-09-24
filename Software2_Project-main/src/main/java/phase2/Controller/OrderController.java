package phase2.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import phase2.Services.NotificationService.NotificationObserver;
import phase2.Services.OrderService.ServiceOrder;
import phase2.Model.*;

import java.util.ArrayList;
@RestController
public class OrderController {
    public ServiceOrder orderService = new ServiceOrder();


    @PostMapping("/SingleOrder")
    public ArrayList<String> singleOrder(@RequestBody Order order) {
        NotificationObserver.NotificationQueue.clear();
        orderService.setOrder(order);
        return  orderService.makeSingleOrder();  /// this should return a queue of messages of single order
    }

    @PostMapping("/CompoundOrder")
    public ArrayList<String> MakeCompoundOrder(@RequestBody ArrayList<Order>ListOfOrders) {
        NotificationObserver.NotificationQueue.clear();
        orderService.setOrders(ListOfOrders);
        return  orderService.MakeCompoundOrder();/// this should return a queue of messages for all participated user
    }



}
