package singleton.v6;

/**
  구현) enum
 * ✅ 장점
 * - '리플랙션' 에 안전하다 ->  리플랙션을 통한 인스턴스 생성 시, 예외가 발생된다.
 * - '역직렬화' 에 안전하다.

     * 자바에서 객체를 역직렬화 할 때, 생성자 호출 없이 인스턴스를 메모리에 직접 생성한다 .
        -> 내부적으로 ObjectInputStream.readObject() 호출
        -> JVM이 클래스를 메모리에 로딩
        -> java.io.ObjectStreamClass 를 사용해서 클래스의 직렬화 정보 추출
        -> JVM은 생성자 호출 없이 메모리에 빈 객체를 “강제로” 생성
        -> 직렬화된 필드 값을 메모리에 직접 채워 넣음

     * 이를 해결하기 위해서 readResolve() 정의해야 하는데, 이를 enum 사용 시 자동으로 해준다.
        -> 내부적으로 역직렬화가 완료된 후, VM은 readResolve() 메서드가 있으면 그 리턴값으로 최종 객체를 대체한다.
        -> 즉, 새로 만든 인스턴스를 버리고, 명시적으로 반환한 인스턴스를 사용한다.

 * ⚠️ 단점
 * - 클래스 로딩 시점에 미리 인스턴스가 생성된다. ( eager initializaion 과 동일한 문제 )
*/

public enum Settings {
    INSTANCE;
}
