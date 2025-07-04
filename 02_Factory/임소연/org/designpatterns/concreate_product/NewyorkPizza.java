package org.designpatterns.concreate_product;

import org.designpatterns.product.Pizza;

public class NewyorkPizza extends Pizza {
    public NewyorkPizza(String size){
        setSize(size);
        setName("Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Tomato Sauce");

        getToppings().add("Mozzarella Cheese");
        getToppings().add("Pepperoni");
    }

}
