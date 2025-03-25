package _01_creational_patterns._01_singleton.v4;

/**
  구현) double checked locking

    * if문 을 통해 인스턴스의 null 유무를 판단하고 없으면 synchronized를 통해 인스턴스를 생성한다.
      따라서 이미 인스턴스가 있는 경우, synchronized 연산 없이 바로 인스턴스를 조회하고 반한한다.
        -> 구현 2: 최적화

    *  또한 인스턴스 조회 시점(getInstance 호출)에 인스턴스가 생성되기 떄문에,
       실제 사용 시에만 인스턴스가 생성되어 사용되지 않는 경우, 인스턴스 생성 비용을 최적화 할 수 있다.
        -> 구현 3: 최적화, 레이지 로딩(Lazy Loading)

     * 그러나 왜 volatile을 사용하지는 이해하려면
       자바 1.4 이하 버전의 멀티스레딩 환경에서의 메모리를 다루는 개념이 선행되어야 한다.
*/
public class Settings {
    private static volatile Settings instance;

    private Settings() { }

    public static  Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
}
