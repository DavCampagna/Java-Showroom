import java.util.ArrayList;

public class Factory {

    private String name;
    private ArrayList<Car> stock;

    public Factory(String name){
        this.name = name;
        this.stock = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public int getStockCount(){
        return getStock().size();
    }

    public void fabricateCar(String model, int factoryPrice, int customerPrice) {
        Car car = new Car(this.name, model, factoryPrice, customerPrice );
        this.stock.add(car);
    }
}
