package nono.java;

public class RelayDelivery implements nono.java.Delivery {

    private  int id;

    public RelayDelivery(int id) {
        this.id = id;
    }

    @Override
    public double getPrice() {
        if (id >= 0 && id <= 22) {
            return 0;
        }
        else if (id >= 23 && id <= 47) {
            return 2.99;
        }
        else {
            return 4.99;
        }
    }

    @Override
    public String getInfo() {
        return "livraison point relais " + getPrice() + "€";
    }
}
