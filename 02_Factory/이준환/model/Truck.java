package Sample;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("트럭 출발");
    }

    @Override
    public void stop() {
        System.out.println("트럭 정지");
    }

    @Override
    public String getType() {
        return "Truck";
    }
}
