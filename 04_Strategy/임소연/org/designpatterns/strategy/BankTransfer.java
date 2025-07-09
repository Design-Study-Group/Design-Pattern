package org.designpatterns.strategy;

import java.util.Random;

public class BankTransfer implements PayStrategy{
    private String bankName;
    private String bankAccount;

    public BankTransfer(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void pay(int amount) {
        Random rand = new Random();
        StringBuilder accountBuilder = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            accountBuilder.append(rand.nextInt(10));
        }
        bankAccount = accountBuilder.toString();

        System.out.println(bankName + " " + bankAccount + "계좌로 "
                + amount + "원을 송금하시면\n 결제가 완료됩니다.");
    }
}
