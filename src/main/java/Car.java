public class Car {

    private String make;
    private String model;
    private int factoryPrice;
    private int customerPrice;

    public Car(String make, String model, int factoryPrice, int customerPrice) {
        this.make = make;
        this.model = model;
        this.factoryPrice = factoryPrice;
        this.customerPrice = customerPrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getFactoryPrice() {
        return factoryPrice;
    }

    public int getCustomerPrice() {
        return customerPrice;
    }
}
