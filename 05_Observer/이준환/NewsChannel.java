public class NewsChannel implements Observer {
    private String name;
    private String news;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        news = message;
        System.out.println(name + "에서 뉴스 업데이트 " + news);
    }

    public String getNews() {
        return news;
    }
}
