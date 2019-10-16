package models;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int age;
    private int wallet;
    private ArrayList<Car> ownedCars;

    public Customer(String name, int age, int wallet) {
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.ownedCars = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWallet() {
        return wallet;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public int ownedCarsCount(){
        return getOwnedCars().size();
    }
}
