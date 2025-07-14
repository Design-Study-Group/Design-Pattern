# Observer Pattern

## 한줄 요약

> 한 객체의 상태변화에 따라, 연결된 다른 객체들이 자동으로 알림을 받고 동작하도록 만드는 패턴

## 사용예시

### 유튜브 구독 시스템

- 유튜브 채널 → Subject (관찰 대상)
- 구독자들 → Observer (관찰자)
- 새 영상 업로드 → 상태 변화
- 알림 전송 → notify()

## 구성요소

- Subject
  - 관찰되는 대상자
  - ex) 유튜브 채널
- Observer
  - 관찰자
  - ex) 구독자
- `notify()`
  - 알림 보내는 기능
- addObserver()
  - 구독버튼을 눌러 알림을 받기

> **실행 예시**
>
> Upload: [test] 새 영상 업로드 -> 새로운 영상: Observer 패턴 익히기
>
> tester1님, 새 영상이 올라왔습니다 (채널명: test)
>
> tester2님, 새 영상이 올라왔습니다 (채널명: test)
>
> Upload: [test] 새 영상 업로드 -> 구독 해제 하셨나요?
>
> tester1님, 새 영상이 올라왔습니다 (채널명: test)
