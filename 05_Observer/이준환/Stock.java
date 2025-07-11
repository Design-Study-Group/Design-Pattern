import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String symbol;
    private int price;

    public Stock(String symbol, int price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        // DecimalFormat을 활용한 포맷 형식 선언
        DecimalFormat df = new DecimalFormat("###,###");

        iter: for (Observer observer : observers) {
            observer.update(symbol + "주가: " + df.format(price));
        }
    }

    void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }

    int getPrice() {
        return price;
    }
}
