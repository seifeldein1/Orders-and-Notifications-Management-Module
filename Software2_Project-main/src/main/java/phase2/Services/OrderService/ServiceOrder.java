package phase2.Services.OrderService;
import com.sun.nio.sctp.Notification;
import org.apache.catalina.Lifecycle;
import phase2.Model.Customer;
import phase2.Model.Order;
import phase2.Model.Product;
import phase2.Repository.InLineCustomer;
import phase2.Services.NotificationService.ConfirmationNotification;
import phase2.Services.NotificationService.NotificationObserver;
import java.util.ArrayList;



public class ServiceOrder {
    private ArrayList <Order> orders;

    private Order singleOrder ;

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void setOrder(Order order) {
        singleOrder = order;
    }

    InLineCustomer obj= new InLineCustomer();


    public ArrayList<String> makeSingleOrder()
    {
        Customer C = obj.searchCustomer(singleOrder.getCustomerId());

        C.deductBalance(singleOrder.getTotalPrice());

        NotificationObserver obj2 = new ConfirmationNotification(C);

        for(var product: singleOrder.getProducts())
        {
            obj2.notify(product);
        }

        return obj2.PrintQueue();
    }




    public  ArrayList<String> MakeCompoundOrder()
    {

        NotificationObserver obj2 = null;
        for(var order: orders)
        {
            Customer C = obj.searchCustomer(order.getCustomerId());
            obj2 = new ConfirmationNotification(C);
            C.deductBalance(order.getTotalPrice());
            for(var product: order.getProducts())
            {
                obj2.notify(product);
            }

        }
        assert obj2 != null;
        return obj2.PrintQueue();
    }
}
