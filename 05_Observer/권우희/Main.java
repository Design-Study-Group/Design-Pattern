package observer.test;

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel("test");

        User tester1 = new User("tester1");
        User tester2 = new User("tester2");

        channel.subscribe(tester1);
        channel.subscribe(tester2);

        channel.uploadNewVideo("새로운 영상: Observer 패턴 익히기");

        channel.unsubscribe(tester2);
        channel.uploadNewVideo("구독 해제 하셨나요?");
    }
}
