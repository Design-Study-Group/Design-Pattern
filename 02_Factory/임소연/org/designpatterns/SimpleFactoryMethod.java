package org.designpatterns;

import org.designpatterns.creator.PizzaStore;
import org.designpatterns.product.Pizza;

public class SimpleFactoryMethod {
   public static void main(String[] args) {
       PizzaStore pizzaStore = new PizzaStore();

       Pizza ChicagoPizza = pizzaStore.orderPizza("chicago", "regular");
       System.out.println(ChicagoPizza);

       Pizza NapoliPizza = pizzaStore.orderPizza("napoli", "large");
       System.out.println(NapoliPizza);

       Pizza NewyorkPizza = pizzaStore.orderPizza("newyork", "extra-large");
       System.out.println(NewyorkPizza);
   }
}
