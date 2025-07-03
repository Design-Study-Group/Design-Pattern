package Sample;

// 5. 팩토리 제공자 (실무에서 자주 사용되는 패턴)
public class VehicleFactoryProvider {
    public static VehicleFactory getFactory(String vehicleType) {
        switch (vehicleType.toLowerCase()) {
            case "car":
                return new CarFactory();
            case "motorcycle":
                return new MotorcycleFactory();
            case "truck":
                return new TruckFactory();
            default:
                throw new IllegalArgumentException("알 수 없는 차량 타입: " + vehicleType);
        }
    }
}
