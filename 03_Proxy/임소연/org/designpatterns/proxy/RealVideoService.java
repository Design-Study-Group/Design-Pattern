package org.designpatterns.proxy;

public class RealVideoService implements VideoService {

    @Override
    public void playVideo(String videoName) {
        System.out.println("요청하신 " + videoName + "가 재생되고 있습니다.");
    }
}
