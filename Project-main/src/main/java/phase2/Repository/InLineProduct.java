package phase2.Repository;
import phase2.Model.*;

import java.util.ArrayList;
import java.util.List;

public class InLineProduct implements ProductRepository {

    private static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "tablet", "sigma", "electronics", 500, 10));
        products.add(new Product(2, "iphone", "Awfarlak", "electronics", 500, 20));
        products.add(new Product(3, "keyboard", "BTech", "electronics", 100, 30));
        products.add(new Product(4, "laptop", "GizaStore", "electronics", 200, 40));
        products.add(new Product(5, "mouse", "MMStore", "electronics", 50, 20));
    }

    @Override
    public void addProduct(int serialNumber, String name, String vendor, String category, double price, int remainingParts) {
        products.add(new Product(serialNumber, name, vendor, category, price, remainingParts));
    }

    @Override
    public void updateProduct(int serialNumber, String name, String vendor, String category, double price, int remainingParts) {
        for (Product product : products) {
            if (product.getSerialNumber() == serialNumber) {
                product.setName(name);
                product.setVendor(vendor);
                product.setCategory(category);
                product.setPrice(price);
                product.setRemainingParts(remainingParts);
            }
        }
    }

    @Override
    public void deleteProduct(int serialNumber) {
        for (Product product : products) {
            if (product.getSerialNumber() == serialNumber) {
                products.remove(product);
            }
        }

    }

    @Override
    public ArrayList<Product> listProduct() {
      return products ;
    }

    @Override
    public Product searchProduct(int serialNumber) {
        for (Product product : products) {
            if (product.getSerialNumber() == serialNumber) {
                return product;
            }
        }
        return null;
    }

}