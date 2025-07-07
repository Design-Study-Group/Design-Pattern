# Proxy Pattern (프록시 패턴)

프록시 패턴은 어떤 객체에 바로 접근하지 않고, 그 객체 앞에 **대리(Proxy) 객체**를 두어  
대신 접근하게 하는 패턴

## 사용 상황

- 접근 제어가 필요할 때  
  (예: 민감한 데이터나 중요한 기능을 아무나 못 쓰게 막고 싶을 때  
  -> 관리자만 접근 가능)

- 무거운 객체의 생성을 늦추고 싶을 때  
  (예: 이미지, 파일, 네트워크 등 리소스가 큰 객체를 실제로 쓸 때만 만들고 싶을 때)

- 원격 객체를 다룰 때  
  (예: 네트워크로 연결된 서버의 객체를 마치 내 컴퓨터에 있는 것처럼 쓰고 싶을 때  
  -> 중간에서 대신 통신)

- 기능을 몰래 추가하고 싶을 때  
  (예: 로그 남기기, 캐싱, 권한 체크 등)

## 구조

```java
    +-----------> [Subject]
    |             △       △
   uses           |       |
    |         +---+       +---+
    |         |   uses        |
[Client]   [Proxy] --> [Real Subject]
```

- Client: 사용하려는 쪽
- Real Subject: 실제 동작하는 객체
- Proxy: 진짜 대신 앞에서 행동하거나 조건 체크
- Subject : Proxy와 Real Subject를 하나로 묶는 인터페이스

### 종류

| 프록시 종류       | 설명                                          |
| ----------------- | --------------------------------------------- |
| **가상 프록시**   | 무거운 객체 생성을 늦춤 (ex. 이미지 로딩)     |
| **보호 프록시**   | 접근 권한 제어                                |
| **원격 프록시**   | 다른 컴퓨터에 있는 객체에 대리 접근           |
| **스마트 프록시** | 부가기능 추가 (ex. 로깅, 카운트, 트랜잭션 등) |

### 참고

**데코레이터 패턴**  
기존 객체에 기능을 동적으로 추가  
장식 추가, 로그/암호화 등 기능 확장  
예시)

- 커피에 우유 추가
- 캐릭터에 방어막 추가

```java
public interface Coffee {
    String getDescription();
    int cost();
}

public class BasicCoffee implements Coffee {
    public String getDescription() { return "커피"; }
    public int cost() { return 3000; }
}

// 데코레이터
public class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription() + " + 우유";
    }

    public int cost() {
        return coffee.cost() + 500;
    }
}
```
