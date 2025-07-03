package org.designpatterns.concreate_creator;

import org.designpatterns.creator.AbstractPizzaStore;
import org.designpatterns.concreate_product.ChicagoPizza;
import org.designpatterns.product.Pizza;

public class ChicagoPizzaStore extends AbstractPizzaStore {
    @Override
    protected Pizza preparePizza(String name, String size) {
        if(name.equalsIgnoreCase("Chicago")) return new ChicagoPizza(size);
        else return null;
    }
}
