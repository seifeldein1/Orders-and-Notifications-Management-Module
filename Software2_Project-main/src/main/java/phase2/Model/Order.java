package phase2.Model;
import java.util.List;


public class Order {
    private int orderId;
    private int customerId;
    private int shippingFees;
    private List<Product> products;

    // Constructor
    public Order(int orderId, int customerId, List<Product> products) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.products = products;
    }

    // Getters
    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getShippingFees() {
        return shippingFees;
    }

    public List<Product> getProducts() {
        return products;
    }

    // Setters
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setShippingFees(int shippingFees) {
        this.shippingFees = shippingFees;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Methods
    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        totalPrice += shippingFees;
        return totalPrice;
    }

    public String P_Names() {
        String order = "";
        for (Product product : products) {
            order += product.getName() + "\n";
        }
        return order;
    }


    public String All() {
        String order = "";
        for (Product product : products) {
            order += product.getName() + " - " + product.getSerialNumber() + " - " + product.getPrice() + "\n";
        }
        return order;
    }


    public void Print() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products: ");
        System.out.println(All());
        System.out.println("Shipping Fees: " + shippingFees);
        System.out.println("Total Price: " + getTotalPrice());
    }
}
