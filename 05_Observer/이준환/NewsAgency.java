import java.util.List;

public class NewsAgency implements Subject{
    private List<Observer> observers = new java.util.ArrayList<>();
    private String news;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    String getNews() {
        return news;
    }
}
