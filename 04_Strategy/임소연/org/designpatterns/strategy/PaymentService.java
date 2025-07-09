package org.designpatterns.strategy;

public class PaymentService {
    private PayStrategy payStrategy;

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void pay(int amount){
        if(payStrategy == null){
            System.out.println("결제 수단이 정해지지 않았습니다.");
        } else {
            payStrategy.pay(amount);
        }
    }
}
