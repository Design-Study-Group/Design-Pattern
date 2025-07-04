package factoryMetohd;

import factoryMetohd.framework.Factory;
import factoryMetohd.framework.Product;
import factoryMetohd.idCard.IDCardFactory;

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
