package org.designpatterns.proxy;

public class Main {
    public static void main(String[] args) {
        VideoService user1 = new VideoProxy(true);
        user1.playVideo("고구려의 흥망성쇠");

        VideoService user2 = new VideoProxy(false);
        user2.playVideo("신라의 삼국통일");
    }
}
