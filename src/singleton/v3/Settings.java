package singleton.v3;

/**
 구현) eager initialization ( 이른 초기화 )
 * 객체를 만드는 비용이 삐싸지 않으면 '미리 인스턴스를 생성' 하는 방법을 통해 Thread Safe 코드를 작성할 수 있다. ->  eager initialization

      static 변수 이기 때문에 클래스가 로딩되는 시점에 초기화가 되어  Method Area 에서 관리한다.
      Method Area 은 모든 인스턴스의 Heap 영역에 공유되며 접근 가능하기 때문에 하나의 인스턴스만을 생성하고 공유할 수 있게 된다.
      따라서 여러 스레드에서 동시에 접근하여도 미리 초기화된 인스턴스에 접근하여 반환하기 때문에, Thread Safe하게 동작할 수 있다.

 */
public class Settings {
    private static final Settings INSTANCE = new Settings(); // staic final, 상수와 동일 -> 대문자 사용

    private Settings() {}

    public static Settings getInstance() {
        return INSTANCE;
    }
}