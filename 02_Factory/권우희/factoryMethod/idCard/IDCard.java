package factoryMethod.idCard;

import factoryMethod.framework.Product;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만납니다.");
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println(this + "를 사용합니다.");
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "owner='" + owner + '\'' +
                '}';
    }

    public String getOwner() {
        return owner;
    }
}
