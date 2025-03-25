package singleton.v5;

/**
  구현) static inner class ( 정적 내부 클래스 )
    * 'inner static class' 를 통해 조회 시점에 인스턴스를 생성할 수 있다,
       -> 레이지 로딩 ( Lazy Loading )

       * getInstance()  호출 시, 해당 클래스가 로딩이 되면서 인스턴스가 초기화 된다.
         static 클래스이기 때문에 method 영역에서 생성되어 모든 인스턴스 heap 영역에 된다.
         따라서 하나의 인스턴스만 생성되어 공유된다.

    * 의문점) 그렇다면 조회 시점에서 동시성 문제가 발생될 수 있지 않나?
       * JVM은 클래스를 처음 로드하고 초기화하는 작업을 하나의 스레드만이 수행하도록 보장한다.
          * 클래스 초기화는 JVM 이 한 번만, 그리고 동기화된 방식으로 수행한다

       * 따라서  INSTANCE = new Settings()도 딱 한 번만 실행한다. 그리고 다른 스레드는 이 초기화가 끝난 뒤에 접근한다.
         즉, JVM 내부에서 클래스 초기화를 스레드 하나만 동작되도록 강제하기 때문에 스레드 안전이 보장된다.
          -> Class Initialization Phase

    * 장점)
       * 지연 로딩(Lazy Loading) -> 메모리 절약 가능
       * JVM 보장으로 Thead Safe 함
          * synchronized 오버헤드 없음
       * 이전 double checked locking 처럼 복잡한 이론적 배경 없이도 쉽게 사용 가능하며, 코드 양도 더 적다.

    * 그러나 해당 방법도 싱글톤 패턴을 꺠트리는 방법이 존재한다.
      1. 리플랙션
      2. 직렬화 & 역직렬화
*/
public class Settings {
    private Settings() {}

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }
}
