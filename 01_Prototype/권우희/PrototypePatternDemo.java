package creational.woohee;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        try {
            //원본 객체 생성
            Prototype original = new Prototype("John", 25, new PrototypeData("creational"));
            System.out.println("원본 객체 생성");
            original.showInfo();
            System.out.println();

            //원본 객체 복제
            System.out.println("원본 객체 복제");
            Prototype clone = (Prototype) original.clone();
            clone.showInfo();
            System.out.println();

            //복제 객체의 상태 변경
            System.out.println("복제 객체의 상태 변경");
            clone.setName("Doe");
            clone.setAge(30);
            clone.setData("test");
//            clone.data.type = "test";
            clone.showInfo();
            System.out.println();

            //원복 객체의 상태는 그대로 유지됨
            System.out.println("원본, 복제 객체 상태 확인 ");
            original.showInfo();
            clone.showInfo();


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
