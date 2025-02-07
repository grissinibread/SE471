package Lab1;

public class Product {
    // attributes
    private final String id;
    private String name;
    private int price;

    // Constructor
    Product(String id) {
        this.id = id;
    }

    // Methods
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
