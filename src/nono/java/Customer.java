package nono.java;

public class Customer {
    private String fullName;
    private String address;

    public String getFullname() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public Customer(String fullName, String address) {
        this.fullName = fullName;
        this.address = address;
    }
}
