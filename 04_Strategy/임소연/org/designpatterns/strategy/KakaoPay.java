package org.designpatterns.strategy;

public class KakaoPay implements PayStrategy{
    private boolean hasPromotion;

    public KakaoPay(boolean hasPromotion) {
        this.hasPromotion = hasPromotion;
    }

    @Override
    public void pay(int amount) {
        int finalPrice = hasPromotion? (int)(amount * 0.9d + 0.5) : amount;
        System.out.println("🍫pay로 " + finalPrice +"원 결제가 완료되었습니다.");
    }
}
