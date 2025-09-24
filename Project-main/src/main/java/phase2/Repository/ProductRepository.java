package phase2.Repository;

import phase2.Model.*;

import java.util.ArrayList;
import java.util.List;

public interface ProductRepository {


    public void addProduct(int serialNumber, String name, String vendor, String category, double price, int remainingParts);

    public void updateProduct(int serialNumber, String name, String vendor, String category, double price, int remainingParts);

    public void deleteProduct(int serialNumber);

    public ArrayList<Product> listProduct();

    public Product searchProduct(int serialNumber);


}
