package Sample;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("승용차 출발");
    }

    @Override
    public void stop() {
        System.out.println("승용차 정지");
    }

    @Override
    public String getType() {
        return "Car";
    }
}
