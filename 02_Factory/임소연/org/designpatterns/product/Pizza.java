package org.designpatterns.product;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private List<String> toppings = new ArrayList<>();
    private String size;

    public Pizza(){}

    public Pizza(String name, String size){
        this.name = name;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                ", size='" + size + '\'' +
                '}';
    }
}

