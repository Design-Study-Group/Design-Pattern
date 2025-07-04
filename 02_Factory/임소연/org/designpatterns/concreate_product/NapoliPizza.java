package org.designpatterns.concreate_product;

import org.designpatterns.product.Pizza;

public class NapoliPizza extends Pizza {
    public NapoliPizza(String size){
        setSize(size);
        setName("Margherita Pizza");
        setDough("Thin Crust Dough");
        setSauce("Fresh Tomato Sauce");

        getToppings().add("Fresh Mozzarella Cheese");
        getToppings().add("Basil");
    }

}
