package Sample;

// 3. 추상 팩토리 클래스
public abstract class VehicleFactory {
    // 팩토리 메서드 - 하위 클래스에서 구현
    public abstract Vehicle createVehicle();

    // 템플릿 메서드 - 공통 로직
    public Vehicle orderVehicle(String type) {
        Vehicle vehicle = createVehicle();
        System.out.println(vehicle.getType() + "생산");
        return vehicle;
    }
}
