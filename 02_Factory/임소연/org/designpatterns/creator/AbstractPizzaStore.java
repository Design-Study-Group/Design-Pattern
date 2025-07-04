package org.designpatterns.creator;

import org.designpatterns.product.Pizza;

public abstract class AbstractPizzaStore {
    public Pizza orderPizza(String name, String size){
        Pizza pizza = preparePizza(name, size);
        return pizza;
    }

    protected abstract Pizza preparePizza(String name, String size);

}
