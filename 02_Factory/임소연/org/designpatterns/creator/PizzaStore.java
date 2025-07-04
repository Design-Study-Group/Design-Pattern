package org.designpatterns.creator;

import org.designpatterns.concreate_product.ChicagoPizza;
import org.designpatterns.concreate_product.NapoliPizza;
import org.designpatterns.concreate_product.NewyorkPizza;
import org.designpatterns.product.Pizza;

public class PizzaStore {
    public final Pizza orderPizza(String name, String size){
        Pizza pizza = preparePizza(name, size);
        return pizza;
    }

    public Pizza preparePizza(String name, String size){
        Pizza pizza = null;

        if(name.equalsIgnoreCase("Chicago")){
            pizza = new ChicagoPizza(size);
        } else if(name.equalsIgnoreCase("Napoli")){
            pizza = new NapoliPizza(size);
        } else if(name.equalsIgnoreCase("Newyork")){
            pizza = new NewyorkPizza(size);
        }
        return pizza;
    }
}