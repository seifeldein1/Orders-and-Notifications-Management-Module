package phase2.Repository;
import phase2.Model.*;

import java.util.List;

public interface OrderRepository {

    public void addOrder(int orderId, int customerId, List<Product> products);

    public void updateOrder(int orderId, int customerId, List<Product> products);

    public void deleteOrder(int id);

    public void listOrder();

    public Order searchOrder(int id);



}
