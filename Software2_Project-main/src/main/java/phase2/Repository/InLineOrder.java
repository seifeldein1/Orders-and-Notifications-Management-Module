package phase2.Repository;
import phase2.Model.*;

import java.util.ArrayList;
import java.util.List;

public class InLineOrder implements OrderRepository {

    private static List<Order> orders = new ArrayList<>();

    static {
        orders.add(new Order(1, 1, new ArrayList<Product>()));
        orders.add(new Order(2, 2, new ArrayList<Product>()));
        orders.add(new Order(3, 3, new ArrayList<Product>()));
        orders.add(new Order(4, 4, new ArrayList<Product>()));
        orders.add(new Order(5, 5, new ArrayList<Product>()));
    }
    @Override
    public void addOrder(int orderId, int customerId, List<Product> products) {
        orders.add(new Order(orderId, customerId, products));

    }

    @Override
    public void updateOrder(int orderId, int customerId, List<Product> products) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                order.setCustomerId(customerId);
                order.setProducts(products);
            }
        }
    }

    @Override
    public void deleteOrder(int id) {
        for (Order order : orders) {
            if (order.getOrderId() == id) {
                orders.remove(order);
            }
        }

    }

    @Override
    public void listOrder() {
        for (Order order : orders) {
            order.Print();
        }

    }

    @Override
    public Order searchOrder(int id) {
        for (Order order : orders) {
            if (order.getOrderId() == id) {
                return order;
            }
        }
        return null;
    }
}
