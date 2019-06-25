package nono.java;

public class DirectDelivery implements nono.java.Delivery {
    @Override
    public double getPrice() {
        return 4.99;
    }

    @Override
    public String getInfo() {
        return "livraison à domicile " + getPrice() + "€";
    }
}
