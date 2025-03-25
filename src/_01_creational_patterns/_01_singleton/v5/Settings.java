package _01_creational_patterns._01_singleton.v5;

/**
 * 📌 구현: static inner class (정적 내부 클래스)
 *
 * - inner static class를 통해 조회 시점에 인스턴스를 생성할 수 있다.
 * - → Lazy Loading (지연 로딩)
 *
 * getInstance() 호출 시, 해당 클래스가 로딩되면서 인스턴스가 초기화된다.
 * static 클래스이기 때문에 method 영역에 생성되며,
 * 하나의 인스턴스로 모든 인스턴스에서 공유된다.
 *
 * ----------------------------------------
 *
 * ❓ 의문점: 조회 시점에서 동시성 문제가 발생하지 않을까?
 *
 * - JVM은 클래스를 처음 로드할 때 하나의 스레드만 초기화를 수행하도록 보장한다.
 * - → 클래스 초기화는 JVM이 한 번만, 동기화된 방식으로 처리한다.
 * - 따라서 INSTANCE = new Settings() 도 오직 한 번만 실행된다.
 * - 다른 스레드는 초기화 완료 이후에 접근한다.
 * - → Class Initialization Phase에 의해 thread-safe가 보장된다.
 *
 * ----------------------------------------
 *
 * ✅ 장점
 *
 * - 지연 로딩(Lazy Loading) → 메모리 절약
 * - JVM 클래스 로딩 보장으로 Thread-safe
 * - synchronized 사용하지 않아 오버헤드 없음
 * - Double-Checked Locking보다 구현이 간단하고 코드도 적다
 *
 * ----------------------------------------
 *
 * ⚠️ 단점: 이 방식도 싱글톤 패턴을 깨는 방법은 존재한다
 *
 * 1. 리플렉션: {@link _01_creational_patterns._01_singleton.breaker.reflection.ReflectionBreaker}
 * 2. 직렬화 & 역직렬화: {@link _01_creational_patterns._01_singleton.breaker.deserialization.SerializationBreaker}
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
