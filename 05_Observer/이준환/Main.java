
public class Main {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        NewsChannel kbs = new NewsChannel("KBS");
        NewsChannel mbc = new NewsChannel("MBC");
        NewsChannel sbs = new NewsChannel("SBS");
        MobileApp newApp = new MobileApp("뉴스앱");

        newsAgency.attach(kbs);
        newsAgency.attach(mbc);
        newsAgency.attach(sbs);
        newsAgency.attach(newApp);

        System.out.print("=".repeat(50));
        System.out.println("\n첫번째 뉴스 발행");
        System.out.println("=".repeat(50));
        newsAgency.setNews("폭염 지속");

        System.out.print("=".repeat(50));
        System.out.println("\n두번째 뉴스 발행");
        System.out.println("=".repeat(50));
        newsAgency.setNews("국민지원금 발표");

        System.out.print("=".repeat(50));
        System.out.println("\nMBC 구독 해지");
        System.out.println("=".repeat(50));
        newsAgency.detach(mbc);
        newsAgency.setNews("정부 AI 정책 발표");

        System.out.print("=".repeat(50));
        System.out.println("\n익명 옵처저 추가");
        System.out.println("=".repeat(50));
        Observer anonymousObserver = message ->
                System.out.println("익명 구독자가 뉴스를 받았습니다." + message);

        newsAgency.attach(anonymousObserver);
        newsAgency.setNews("마지막 뉴스 입니다.");

        System.out.println("\n" + "=".repeat(50));
        System.out.println("주식 가격 모니터링 시스템 예제");
        System.out.println("=".repeat(50));

        // 주식 가격 모니터링 시스템 예제
        Stock samsumgStock = new Stock("samsung", 62400);

        StockDisplay mobileDisplay = new StockDisplay("모바일 앱");
        StockDisplay webDisplay = new StockDisplay("웹 대시보드");
        StockDisplay alertSystem = new StockDisplay("알림 시스템");

        samsumgStock.attach(mobileDisplay);
        samsumgStock.attach(webDisplay);
        samsumgStock.attach(alertSystem);

        System.out.println("\n--- 주가 업데이트 ---");
        samsumgStock.setPrice(62000);
        samsumgStock.setPrice(61500);

        System.out.println("\n--- 웹 대시보드 구독 해지 ---");
        samsumgStock.detach(webDisplay);
        samsumgStock.setPrice(62400);
    }
}