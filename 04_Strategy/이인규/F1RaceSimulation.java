// 전략 인터페이스
interface F1TireStrategy {
    int getMaxSpeed();
    int getDurability();

    default double calculateSpeed() {
        return getMaxSpeed() * (getDurability() / 100.0);
    }
}

// 전략 구현체: Soft 타이어
class SoftTire implements F1TireStrategy {
    public int getMaxSpeed() { return 350; }
    public int getDurability() { return 30; }
}

// 전략 구현체: Medium 타이어
class MediumTire implements F1TireStrategy {
    public int getMaxSpeed() { return 320; }
    public int getDurability() { return 60; }
}

// 전략 구현체: Hard 타이어
class HardTire implements F1TireStrategy {
    public int getMaxSpeed() { return 300; }
    public int getDurability() { return 90; }
}

// 전략을 사용하는 객체: F1 자동차 (Team A, Team B 등)
class TeamCar {
    private String name;
    private F1TireStrategy tireStrategy;
    private int totalDistance = 0;

    public TeamCar(String name, F1TireStrategy initialTire) {
        this.name = name;
        this.tireStrategy = initialTire;
    }

    public void changeTireStrategy(F1TireStrategy newTire) {
        System.out.println(name + " 타이어 전략 변경됨: " + newTire.getClass().getSimpleName());
        this.tireStrategy = newTire;
    }

    public void raceLap() {
        double speed = tireStrategy.calculateSpeed();
        totalDistance += speed;
        // System.out.printf("%s 팀이 %.2f km 달렸습니다. 누적 거리: %d km%n", name, speed, totalDistance);
    }

    public int getTotalDistance() {
        return totalDistance;
    }
}

// 실행 테스트
public class F1RaceSimulation {
    public static void main(String[] args) {
        TeamCar teamA = new TeamCar("TEAM_A", new SoftTire());
        TeamCar teamB = new TeamCar("TEAM_B", new HardTire());

        // 3 랩씩 주행
        for (int i = 1; i <= 3; i++) {
            // System.out.println("\n🏁 Lap " + i);
            teamA.raceLap();
            teamB.raceLap();
        }

        // 격차 비교
        int disA = teamA.getTotalDistance();
        int disB = teamB.getTotalDistance();
        if(disA > disB){
            System.out.println("teamA가 " + (disA - disB) + "km 만큼 앞서고 있습니다.");
        }
        else{
            System.out.println("teamB가 " + (disB - disA) + "km 만큼 앞서고 있습니다.");
        }

        // 전략 변경 (타이어 교체)
        teamA.changeTireStrategy(new MediumTire());
        teamB.changeTireStrategy(new SoftTire());

        // 추가 주행
        for (int i = 4; i <= 5; i++) {
            // System.out.println("\n🏁 Lap " + i);
            teamA.raceLap();
            teamB.raceLap();
        }

        // 격차 비교
        disA = teamA.getTotalDistance();
        disB = teamB.getTotalDistance();
        if(disA > disB){
            System.out.println("teamA가 " + (disA - disB) + "km 만큼 앞서고 있습니다.");
        }
        else{
            System.out.println("teamB가 " + (disB - disA) + "km 만큼 앞서고 있습니다.");
        }
    }
}
