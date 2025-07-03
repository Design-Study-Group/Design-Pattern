package org.designpatterns;

import org.designpatterns.concreate_creator.ChicagoPizzaStore;
import org.designpatterns.concreate_creator.NapoliPizzaStore;
import org.designpatterns.concreate_creator.NewyorkPizzaStore;
import org.designpatterns.creator.AbstractPizzaStore;
import org.designpatterns.product.Pizza;

public class FactoryMethod {
    public static void main(String[] args) {
        AbstractPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("Chicago", "large");
        System.out.println(chicagoPizza);

        AbstractPizzaStore napoliPizzaStore = new NapoliPizzaStore();
        Pizza napoliPizza = napoliPizzaStore.orderPizza("Napoli", "small");
        System.out.println(napoliPizza);

        AbstractPizzaStore newyorkPizzaStore = new NewyorkPizzaStore();
        Pizza newyorkPizza = newyorkPizzaStore.orderPizza("Newyork", "medium");
        System.out.println(newyorkPizza);
    }
}
