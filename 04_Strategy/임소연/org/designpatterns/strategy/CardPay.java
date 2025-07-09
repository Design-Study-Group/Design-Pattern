package org.designpatterns.strategy;

public class CardPay implements PayStrategy {
    private String cardCompany;

    public CardPay(String cardCompany) {
        this.cardCompany = cardCompany;
    }

    @Override
    public void pay(int amount) {
        System.out.println(cardCompany + "로 결제 요청 중...");
        System.out.println("💳요청하신 카드로 " + amount + "원 결제가 완료되었습니다.");
    }
}
