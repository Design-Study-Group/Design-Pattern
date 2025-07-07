public class ImageProxy implements Image{
    private RealImage realImage;
    private String fileName;
    private boolean hasAccess = false;

    public ImageProxy(String fileName, boolean hasAccess) {
        this.fileName = fileName;
        this.hasAccess = hasAccess;
    }
    @Override
    public void display() {
        if (hasAccess  == false) {
            System.out.println("엑세스 권한이 없습니다." + fileName);
            return;
        }

        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }

    @Override
    public String getImageInfo() {
        return "Proxy Image " + fileName + " (접근권한: " + hasAccess + ")";
    }
}
