package models;

import behaviours.IBuy;
import behaviours.IBuyable;
import behaviours.ISell;

import java.util.ArrayList;

public class Factory implements ISell {

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

    public Car getCarByModel(String model){
        Car foundCar = null;
        for(Car car : this.stock) {
            if(car.getModel() == model){
                foundCar = car;
            }
        }
        return foundCar;
    }

    public void placeOrder(String model, IBuy buyer) {
        Car car = getCarByModel(model);
        this.stock.remove(car);
        sellTo(car, buyer);
    }


    public void sellTo(IBuyable car, IBuy buyer) {
        buyer.buy(car);
    }
}
