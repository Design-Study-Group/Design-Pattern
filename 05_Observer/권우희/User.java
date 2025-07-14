package observer.test;

import java.util.Observable;

public class User implements Subscriber {
    private String username;
    public User(String username) {
        this.username = username;
    }

    @Override
    public void notify(String channelName, String videoTitle) {
        System.out.println(username + "님, 새 영상이 올라왔습니다 (채널명: " + channelName + ")");
    }
}
