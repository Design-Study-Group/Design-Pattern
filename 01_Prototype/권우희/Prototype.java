package creational.woohee;

public class Prototype implements Cloneable {
    private String name;
    private int age;
    PrototypeData data;

    public Prototype(String name, int age, PrototypeData data) {
        this.name = name;
        this.age = age;
        this.data = data;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setData(String data) {
        this.data.type = data;
    }
    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Data: " + data.type);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            Prototype cloned = (Prototype) super.clone();       // 얕은 복사
            cloned.data = (PrototypeData) data.clone();         // 깊은 복사: 참조형도 복제
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
