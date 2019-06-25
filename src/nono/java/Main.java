package nono.java;

public class Main {
    public static  void main(String[] args) {
        nono.java.Product cafe = new nono.java.Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
        nono.java.Product tv = new nono.java.Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
        nono.java.Fridge fridge = new nono.java.Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);

        nono.java.Customer customer = new nono.java.Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");

        nono.java.Bill bill = new nono.java.Bill(customer, new nono.java.RelayDelivery(27));
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);

        nono.java.Writer consoleWriter = new nono.java.Writer() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }

            @Override
            public void writeLine(String line) {
                System.out.println(line);
            }
        };

        bill.generate(consoleWriter);
    }
}
