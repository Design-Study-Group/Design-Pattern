package org.designpatterns.concreate_product;

import org.designpatterns.product.Pizza;

public class ChicagoPizza extends Pizza {
    public ChicagoPizza(String size){
        setSize(size);
        setName("Chicago Pizza");
        setDough("Thick Crust Dough");
        setSauce("Marinara Sauce");

        getToppings().add("Shred Cheese");
        getToppings().add("Salami");
        getToppings().add("Mushroom");
        getToppings().add("Bell Pepper");
    }

}
