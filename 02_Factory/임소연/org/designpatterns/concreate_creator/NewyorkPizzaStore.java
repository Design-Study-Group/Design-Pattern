package org.designpatterns.concreate_creator;

import org.designpatterns.creator.AbstractPizzaStore;
import org.designpatterns.concreate_product.NewyorkPizza;
import org.designpatterns.product.Pizza;

public class NewyorkPizzaStore extends AbstractPizzaStore {
    @Override
    protected Pizza preparePizza(String name, String size) {
        if(name.equalsIgnoreCase("Newyork")) return new NewyorkPizza(size);
        else return null;
    }
}
