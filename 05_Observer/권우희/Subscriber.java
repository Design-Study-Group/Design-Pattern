package observer.test;

public interface Subscriber {
    void notify(String channelName, String videoTitle);
}
