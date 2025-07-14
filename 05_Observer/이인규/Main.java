import java.util.ArrayList;
import java.util.List;

interface Observer{
    /**
 * Receives a notification with the specified message.
 *
 * @param message the message sent by the subject
 */
void update(String message);
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    /**
     * Registers an observer to receive notifications from this subject.
     *
     * @param o the observer to add
     */
    void addObserver(Observer o) {
        observers.add(o);
    }

    /**
     * Unregisters an observer so it no longer receives notifications from this subject.
     *
     * @param o the observer to remove
     */
    void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * Notifies all registered observers with the specified message.
     *
     * @param message the message to send to each observer
     */
    void notify(String message){
        for(Observer o : observers){
            o.update(message);
        }
    }
}

class ConcreteObserver implements Observer{
    private String name;

    /**
     * Constructs a ConcreteObserver with the specified name.
     *
     * @param name the identifier for this observer
     */
    ConcreteObserver(String name){
        this.name = name;
    }

    /**
     * Receives a notification message and prints it to the console, prefixed with the observer's name.
     *
     * @param message the notification message sent by the subject
     */
    @Override
    public void update(String message){
        System.out.println(name + "에게 전송 : " + message);
    }
}

public class Main {
    /**
     * Demonstrates the Observer design pattern by creating subjects, registering observers, and broadcasting notifications.
     *
     * Creates two subjects, registers multiple observers to each, and sends messages to all registered observers.
     *
     * @param args command-line arguments (not used)
     */
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
