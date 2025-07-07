import Caching.CachedDataServiceProxy;
import Caching.DataService;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== PROXY PATTERN 예제 ===");
        testProxyPattern();

        System.out.println("\n=== CACHING PROXY 예제 ===");
        testCachingProxy();
    }

    private static void testProxyPattern() {
        Image image1 = new ImageProxy("test.jpg", true);
        System.out.println(image1.getImageInfo());
        image1.display();
        image1.display();

        System.out.println();

        Image image2 = new ImageProxy("test2.jpg", false);
        System.out.println(image2.getImageInfo());
        image2.display();
    }

    private static void testCachingProxy() {
        DataService dataService = new CachedDataServiceProxy();

        // 데이터베이스
        System.out.println("첫번재 호출 " + dataService.getData("key1"));

        // 캐시
        System.out.println("두번재 호출 " + dataService.getData("key1"));

        // 데이터베이스
        System.out.println("다른 키로 호출 " + dataService.getData("key2"));

        // 캐시
        System.out.println("캐시 키로 호출 " + dataService.getData("key2"));
    }
}