# Factory Method

> **한줄 요약**
>
> 상속과 다형성을 이용한 객체지향 디자인 패턴이며,
> 추상 클래스에서 기본 구조를 정의하고, 하위 클래스가 구체적인 동작을 구현.

## Product

- 프레임워크, 상위 클래스아다.
- 이 패턴으로 생성되는 인스턴스가 가져야할 인터페이스(API)를 결정하는 추상 클래스이다.
- 구체적인 내용은 ConcreteProduct가 결정한다.

## Creator

- 프레임워크, product를 생성하는 추상 클래스이다.
- 구체적인 내용은 하위 클래스 ConcreteCreator가 결정한다.
- 실제로 생성할 ConcreteProduct에 대해서는 아는 바가 없다.

## ConcreteProduct

- 구체적으로 살을 붙이는 쪽으로 구체적인 제품을 결정한다.

## ConcreateCreator

- 구체적으로 살을 붙이는 쪽으로 제품을 만들 클래스를 결정한다.
