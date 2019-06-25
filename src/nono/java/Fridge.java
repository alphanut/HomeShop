package nono.java;

public class Fridge extends nono.java.Product {

    private int liter;
    private boolean freezer;

    public Fridge(String name, String description, double price, int liter, boolean freezer) {
        super(name, description, price);
        this.liter = liter;
        this.freezer = freezer;
    }

    public int getLiter() {
        return liter;
    }

    public boolean isFreezer() {
        return this.freezer;
    }
}
