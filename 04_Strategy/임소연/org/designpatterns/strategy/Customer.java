package org.designpatterns.strategy;

import java.util.Scanner;

public class Customer {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        int amount = inputAmount();
        PayStrategy payStrategy = choosePayStrategy();

        if(payStrategy != null){
            paymentService.setPayStrategy(payStrategy);
            paymentService.pay(amount);
        } else {
            System.out.println("결제 수단을 잘못 입력하셨습니다.");
        }
    }

    private static int inputAmount(){
        System.out.print("결제 금액을 입력하세요. > ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        return amount;
    }

    private static PayStrategy choosePayStrategy(){
        System.out.println("======== 결제 수단을 선택하세요. =======");
        System.out.println("1. 무통장입금\t 2. 카드 결제\t 3. 카카오페이");
        int method = scanner.nextInt();
        scanner.nextLine();

        switch (method) {
            case 1:
                return handleBankTransfer();
            case 2:
                return handleCardPay();
            case 3:
                return handleKakaoPay(true);
            default:
                return null;
        }
    }

    private static PayStrategy handleBankTransfer() {
        System.out.println("======== 1. 무통장입금 ========");
        System.out.print("입금하실 은행을 입력하세요. : ");
        String bankName = scanner.nextLine();
        return new BankTransfer(bankName);
    }

    private static PayStrategy handleCardPay() {
        System.out.println("======== 2. 카드 결제 ========");
        System.out.print("결제하실 카드사를 입력하세요. : ");
        String cardCompany = scanner.nextLine();
        return new CardPay(cardCompany);
    }

    private static PayStrategy handleKakaoPay(boolean isKakaoPay) {
        System.out.println("======== 3. 카카오페이 ========");
        System.out.println("프로모션 대상 여부를 선택하세요 1. 참여 0. 미참여");
        int result = scanner.nextInt();
        scanner.nextLine();
        if (result == 1) {
            return new KakaoPay(true);
        } else if (result == 0) {
            return new KakaoPay(false);
        }
        System.out.println("유효하지 않은 값을 입력하셨습니다.");
        return null;
    }
}
