package Sample;

public class FactoryMethodExample {
    public static void main(String[] args) {
        // 방법 1: 직접 팩토리 사용
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.orderVehicle("car");
        car.start();
        car.stop();

        System.out.println("---");

        // 방법 2: 팩토리 제공자 사용 (더 실용적)
        String[] vehicleTypes = {"car", "motorcycle", "truck"};

        for (String type : vehicleTypes) {
            VehicleFactory factory = VehicleFactoryProvider.getFactory(type);
            Vehicle vehicle = factory.orderVehicle(type);
            vehicle.start();
            vehicle.stop();
            System.out.println();
        }
    }
}
