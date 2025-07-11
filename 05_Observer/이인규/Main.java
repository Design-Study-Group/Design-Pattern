import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(String message);
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    void addObserver(Observer o) {
        observers.add(o);
    }

    void removeObserver(Observer o) {
        observers.remove(o);
    }

    void notify(String message){
        for(Observer o : observers){
            o.update(message);
        }
    }
}

class ConcreteObserver implements Observer{
    private String name;

    ConcreteObserver(String name){
        this.name = name;
    }

    @Override
    public void update(String message){
        System.out.println(name + "에게 전송 : " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();                          // 옵저버 목록 저장
        subject.addObserver(new ConcreteObserver("A"));     // 옵저버 등록(안내 받을 객체)
        subject.addObserver(new ConcreteObserver("B"));     // 옵저버 등록(안내 받을 객체)

        subject.notify("Hello");    // 반갑다고 안내
        subject.notify("End");      // 끝났다고 안내

        Subject my_youtube_channel = new Subject();
        my_youtube_channel.addObserver(new ConcreteObserver("침착맨"));
        my_youtube_channel.addObserver(new ConcreteObserver("미스터 비스트"));

        my_youtube_channel.notify("방송 켰대");
        my_youtube_channel.notify("방송 껐대");
    }

}
