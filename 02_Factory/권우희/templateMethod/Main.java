package templateMethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("HELLO");
        d1.display();
        d2.display();
    }
}
