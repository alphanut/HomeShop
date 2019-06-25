package nono.java;

public class TakeAwayDelivery implements nono.java.Delivery {
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getInfo() {
        return "retrait gratuit à l'entrepôt";
    }
}
