public class MobileApp implements Observer {

    private String appName;
    private String news;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String message) {
        this.news = message;
        System.out.println(appName + " 앱 푸시 알림: " + news);
    }

    public String getNews() {
        return news;
    }
}