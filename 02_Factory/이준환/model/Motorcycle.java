package Sample;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("오토바이 출발");
    }

    @Override
    public void stop() {
        System.out.println("오토바이 정지");
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }
}
