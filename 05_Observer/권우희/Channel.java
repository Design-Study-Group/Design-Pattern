package observer.test;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String channelName;
    private List<Subscriber> subscribers = new ArrayList<>();

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void uploadNewVideo(String videoTitle) {
        System.out.println("Upload: [" + channelName + "] 새 영상 업로드 -> " + videoTitle);
        notifySubscribers(videoTitle);
    }

    private void notifySubscribers(String videoTitle) {
        for(Subscriber subscriber : subscribers) {
            subscriber.notify(channelName, videoTitle);
        }
    }
}
