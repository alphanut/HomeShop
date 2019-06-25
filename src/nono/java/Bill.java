package nono.java;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private nono.java.Customer customer;
    private Map<nono.java.Product, Integer> products = new HashMap<nono.java.Product, Integer>();
    private nono.java.Delivery delivery;

    public nono.java.Customer getCustomer() {
        return customer;
    }

    public Map<nono.java.Product, Integer> getProducts() {
        return products;
    }

    public Bill(nono.java.Customer customer, nono.java.Delivery delivery) {

        this.customer = customer;
        this.delivery = delivery;
    }

    /**
     * Add a product to the bill
     * @param product product to add
     * @param quantity quantity to add
     */
    public void addProduct(nono.java.Product product, Integer quantity) {

        Integer total = quantity;
        if (products.containsKey(product)) {
            total += products.get(product);
        }

        products.put(product, total);
    }

    /**
     * Generate the bill
     * @param writer
     */
    public void generate(nono.java.Writer writer) {
        writer.start();
        writer.writeLine("HomeShop compagnie");
        writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
        writer.writeLine("");
        writer.writeLine("Facture à l'attention de : ");
        writer.writeLine(customer.getFullname());
        writer.writeLine(customer.getAddress());
        writer.writeLine("");
        writer.writeLine("Mode de livraison : " + delivery.getInfo());
        writer.writeLine("");
        writer.writeLine("Produits : ");
        writer.writeLine("-----------------------------------------------------");
        for (Map.Entry<nono.java.Product, Integer> entry : products.entrySet()) {
            nono.java.Product product = entry.getKey();
            Integer quantity = entry.getValue();
            writer.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s)");
            writer.writeLine(product.getDescription());
            writer.writeLine("");
        }
        writer.writeLine("Livraison : " + delivery.getPrice());
        writer.writeLine("-----------------------------------------------------");
        writer.writeLine("Total : " + this.getTotal());
        writer.stop();
    }

    public double getTotal() {
        double total = delivery.getPrice();
        for (Map.Entry<nono.java.Product, Integer> entry : products.entrySet()) {
            nono.java.Product product = entry.getKey();
            Integer quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total;
    }
}
