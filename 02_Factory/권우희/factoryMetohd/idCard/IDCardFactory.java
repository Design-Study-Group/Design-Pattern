package factoryMetohd.idCard;

import factoryMetohd.framework.Factory;
import factoryMetohd.framework.Product;

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
