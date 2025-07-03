package factoryMethod.idCard;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String p) {
        return new IDCard(p);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
