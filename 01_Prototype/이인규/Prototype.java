import java.util.HashMap;
import java.util.Map;

interface Product extends Cloneable {
    public abstract void use(String s);     // 인스턴스 사용 메소드
    public abstract Product createCopy();   // 인스턴스 복제 메소드
}

class Manager{
    // 쇼케이스에 클래스 이름을 기술
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product prototype){
        showcase.put(name, prototype);  // 쇼케이스에 이름 추가
    }

    public Product create(String prototypeName){    // 프로토 타입 이름을 쇼케이스에 추가
        Product p = showcase.get(prototypeName);

        // 생성한 제품 인스턴스를 복제하도록 createCopy 메소드 호출
        return p.createCopy();
    }
}

// 상품 인터페이스를 통해 메시지 박스를 만듦
class MessageBox implements Product{
    private char decochar;

    // 메시지 박스에 데코 문자 지정
    public MessageBox(char decochar){
        this.decochar = decochar;
    }

    // 상품을 사용하도록 오버라이딩
    @Override
    public void use(String s){
        int decolen = 1 + s.length() + 1;
        for(int i=0;i<decolen;i++){
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + s + decochar);
        for(int i=0;i<decolen;i++){
            System.out.print(decochar);
        }
        System.out.println();
    }

    // 상품 객체를 사용하도록 오버라이딩
    @Override
    public Product createCopy() {
        Product p = null;
        try{
            p = (Product) clone();  // java.lang.Cloneable 에서 인스턴스 복제 메소드 지원
        }
        // 인터페이스가 구현되지 않았을 경우 해당 에러를 발생시킨다.
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}

class UnderlinePen implements Product{
    private char ulchar;

    public UnderlinePen(char ulchar){
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s){
        int ulen = s.length();
        System.out.println(s);
        for(int i=0;i<ulen;i++){
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy(){
        Product p = null;
        try{
            p = (Product) clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}

public class Prototype {
    public static void main(String[] args) {
        Manager manager = new Manager();                       // 상품 이름, ConcretePrototype 인스턴스 저장
        UnderlinePen upen = new UnderlinePen('-');      // ConcretePrototype 인스턴스 생성
        MessageBox mbox = new MessageBox('*');        // ConcretePrototype 인스턴스 생성
        MessageBox sbox = new MessageBox('/');        // ConcretePrototype 인스턴스 생성

        manager.register("strong message", upen);   // 매니저에 상품 이름, 콘크리트 프로토타입 인스턴스 저장
        manager.register("warning box", mbox);      // 매니저에 상품 이름, 콘크리트 프로토타입 인스턴스 저장
        manager.register("slash box", sbox);        // 매니저에 상품 이름, 콘크리트 프로토타입 인스턴스 저장

        Product p1 = manager.create("strong message");      // 이용자
        p1.use("Hello World 1");

        Product p2 = manager.create("warning box");         // 이용자
        p2.use("Hello World 2");

        Product p3 =  manager.create("slash box");          // 이용자
        p3.use("Hello World 3");
    }
}