package nono.java;

public class Product {
    private String name;
    private String description;
    private double price;

    /**
     * Display a full description of the product
     */
    public void look() {
        System.out.println(String.format(name + " : " + price + "%n" + description));
    }

    /**
     * Add a product to a bill
     * @param bill the concerned bill
     * @param quantity quantity to add
     */
    public void buy(nono.java.Bill bill, Integer quantity) {

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
