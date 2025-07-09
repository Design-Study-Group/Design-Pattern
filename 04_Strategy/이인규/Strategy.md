# Strategy 전략 패턴

## 전략 패턴 개요

[F1 Racing 예제](./F1RaceSimulation.java)

- 전략 인터페이스 `F1_Tire_Strategy`
- 실제 전략 `SoftTire`, `MediumTire`, `HardTire`
- 전략을 사용할 객체 `TEAM_A_Car`, `TEAM_B_Car`

## 전략 패턴을 사용하는 이유

- **전략을 고정**하지 않고, **위임하는 방식**으로 약한 결합에 의해 전략 수정에 유리하다.
- **실행중**에도 **전략 교체**가 **가능**하다.

## 전략 변경 방식

- **새로 생성한 인스턴스**로 변경
- **기존의 인스턴스를 재사용**해서 변경
