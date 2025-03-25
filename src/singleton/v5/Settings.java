package singleton.v5;

/**
 * <h2><strong>📌 구현: static inner class (정적 내부 클래스)</strong></h2>
 *
 * <hr>
 *
 * <ul>
 *   <li> <strong>inner static class</strong> 를 통해 조회 시점에 인스턴스를 생성할 수 있다.</li>
 *   <li>→ <strong>Lazy Loading (지연 로딩)</strong></li>
 * </ul>
 *
 * <p>
 * getInstance() 호출 시, 해당 클래스가 로딩되면서 인스턴스가 초기화된다.<br>
 * static 클래스이기 때문에 method 영역에 생성되며, 하나의 인스턴스로 모든 인스턴스에서 공유된다.
 * </p>
 *
 * <hr>
 *
 * <p><strong>❓ 의문점: 조회 시점에서 동시성 문제가 발생하지 않을까?</strong></p>
 *
 * <ul>
 *   <li>JVM은 클래스를 <strong>처음 로드할 때 하나의 스레드만</strong> 초기화를 수행하도록 보장한다.</li>
 *   <li>→ 클래스 초기화는 JVM이 <strong>한 번만, 동기화된 방식</strong>으로 처리한다.</li>
 *   <li>따라서 <code>INSTANCE = new Settings()</code>도 오직 한 번만 실행된다.</li>
 *   <li>다른 스레드는 초기화 완료 이후에 접근한다.</li>
 *   <li>→ <strong>Class Initialization Phase</strong>에 의해 thread-safe가 보장된다.</li>
 * </ul>
 *
 * <hr>
 *
 * <p><strong>✅ 장점</strong></p>
 *
 * <ul>
 *   <li>지연 로딩(Lazy Loading) → 메모리 절약</li>
 *   <li>JVM 클래스 로딩 보장으로 <strong>Thread-safe</strong></li>
 *   <li><code>synchronized</code> 사용하지 않아 <strong>오버헤드 없음</strong></li>
 *   <li>Double-Checked Locking보다 구현이 간단하고 코드도 적다</li>
 * </ul>
 *
 * <hr>
 *
 * <p><strong>⚠️ 단점: 이 방식도 싱글톤 패턴을 깨는 방법은 존재한다</strong></p>
 *
 * <ol>
 *   <li>리플렉션: {@link singleton.breaker.reflection.ReflectionBreaker}</li>
 *   <li>직렬화 & 역직렬화: {@link singleton.breaker.deserialization.SerializationBreaker}</li>
 * </ol>
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
