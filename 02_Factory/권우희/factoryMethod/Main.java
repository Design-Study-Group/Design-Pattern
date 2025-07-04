package factoryMethod;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;
import factoryMethod.idCard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product p1 = factory.create("P1");
        Product p2 = factory.create("P2");
        Product p3 = factory.create("P3");
        p1.use();
        p2.use();
        p3.use();
    }
}
