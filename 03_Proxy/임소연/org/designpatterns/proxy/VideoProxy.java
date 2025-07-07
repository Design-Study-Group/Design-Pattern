package org.designpatterns.proxy;

public class VideoProxy implements VideoService{
    private RealVideoService realVideoService;
    private boolean isPremiumMember;

    public VideoProxy(boolean isPremiumMember) {
        this.isPremiumMember = isPremiumMember;
        this.realVideoService = new RealVideoService();
    }

    public void playVideo(String videoName){
        if(isPremiumMember){
            realVideoService.playVideo(videoName);
        } else {
            System.out.println("선택하신 " + videoName + "은 이용 불가합니다. 멤버십 구매자만 이용 가능한 컨텐츠입니다.");
        }
    }
}
