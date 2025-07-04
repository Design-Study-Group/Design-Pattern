package org.designpatterns.concreate_creator;

import org.designpatterns.creator.AbstractPizzaStore;
import org.designpatterns.concreate_product.NapoliPizza;
import org.designpatterns.product.Pizza;

public class NapoliPizzaStore extends AbstractPizzaStore {
    @Override
    protected Pizza preparePizza(String name, String size) {
        if(name.equalsIgnoreCase("Napoli")) return new NapoliPizza(size);
        else return null;
    }
}
