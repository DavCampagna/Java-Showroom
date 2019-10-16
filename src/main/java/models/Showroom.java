package models;

import behaviours.IBuy;

import java.util.ArrayList;

public class Showroom implements IBuy {

    private String name;
    private ArrayList<Car> selection;
    private int till;

    public Showroom(String name) {
        this.name = name;
        this.selection = new ArrayList<Car>();
        this.till = 250000;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Car> getSelection() {
        return selection;
    }

    public int getSelectionCount(){
        return getSelection().size();
    }

    public int getTill() {
        return till;
    }
}
