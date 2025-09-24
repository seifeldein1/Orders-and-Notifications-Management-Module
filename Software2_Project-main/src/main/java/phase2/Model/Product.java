package phase2.Model;

public class Product {
    private int serialNumber;
    private String name;
    private String vendor;
    private String category;
    private double price;
    private int remainingParts;

    // Constructor

    public Product(int serialNumber, String name, String vendor, String category, double price, int remainingParts) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.vendor = vendor;
        this.category = category;
        this.price = price;
        this.remainingParts = remainingParts;
    }

    // Getters

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getVendor() {
        return vendor;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getRemainingParts() {
        return remainingParts;
    }

    // Setters

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRemainingParts(int remainingParts) {
        this.remainingParts = remainingParts;
    }

    // Methods

    public void Print() {
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Name: " + name);
        System.out.println("Vendor: " + vendor);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Remaining Parts: " + remainingParts);
    }






}
