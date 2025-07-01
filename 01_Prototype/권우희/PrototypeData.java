package creational.woohee;

public class PrototypeData implements Cloneable {
    String type;

    public PrototypeData(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
