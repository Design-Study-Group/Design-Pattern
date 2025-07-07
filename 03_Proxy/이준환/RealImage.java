public class RealImage implements Image {
    private String fileName;

    RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("이미지 로딩 : " + fileName);
        try {
            // 생성에 비용이 많이 드는 시뮬레이션
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void display() {
        System.out.println("이미지를 화면 출력...");
    }

    @Override
    public String getImageInfo() {
        return "image file " + fileName;
    }
}
