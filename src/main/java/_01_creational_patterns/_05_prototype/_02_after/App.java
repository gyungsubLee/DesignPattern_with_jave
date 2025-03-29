package _01_creational_patterns._05_prototype._02_after;

/**
 * 🐧프로토타입 패턴 적용
 *  - Cloneable 인터페이스를 상속하여 인스턴스 생성 프로세스를 clone() 메서드에 오버라이딩
 *  - 외부에서는 clone() 호출만을 통해 인스턴스 객체를 복사 가능하도록 한다.
 *    - {@link _01_creational_patterns._05_prototype._02_after.GithubIssue}
 *
 * ✅장점
 * 1. 복잡한 생성 로직 캡슐화
 *  - 객체 생성 시 로직이 복잡하거나 비용이 많이 들 경우,
 *    clone()을 사용하면 그 복잡한 생성 과정을 외부에 숨길 수 있다.
 *
 * 2. 간단한 복사 방법 제공
 *  - clone() 한 줄로 객체를 복제할 수 있어, 반복적인 필드 설정 코드 없이 동일한 속성을 가진 새 객체 생성 가능
 *
 * 3. 불변성과 객체 격리를 위한 Deep Copy
 *  - 원본 데이터를 건드리지 않고, 독립적인 복제 객체를 만들어 추가 변경 가능
 * 	- 특히, 객체 상태가 바뀌면 안 되는 상황(예: 상태 저장, 롤백 등)에 유용
 *
 * 4. 런타임에 동적으로 객체 복사 가능
 *  - 어떤 구체적인 타입인지 몰라도, 런타임에 clone만 호출하면 동일한 타입의 객체 생성 가능
 *
 * 5. Factory, Builder 없이도 객체 복사 가능
 *  - 복사에 초점이 맞춰져 있어 별도의 생성 패턴 없이도 객체 재활용이 용이함
 *
 * 🤬단점
 * 1. Cloneable 인터페이스와 clone() 메서드의 설계 한계
 *  - Cloneable은 marker interface(표시 인터페이스)인데,
 *    내부적으로 Object.clone()을 호출하게 유도만 할 뿐 복사 로직에 대한 계약(contract)이 없음
 *  - 개발자가 직접 복사 로직을 구현해야 해서 실수할 여지가 많음
 *
 * 2. Deep Copy 구현이 번거로움 ( 복잡한 객체 구조에서는 성능 문제 발생 )
 *  - 참조 타입이 많아질수록 각 객체의 필드도 전부 복사해야 하므로 유지보수성이 떨어질 수 있음
 *   -> 객체 내에 또 다른 객체가 있을 경우, 또 Deep Copy를 구현해야 함
 *  - 깊은 복사를 수행할 경우 객체 트리 전체를 재귀적으로 복사해야 해서 성능 비용이 큼
 *
 * 3. 생성자 호출이 생략되기 때문에 불완전한 객체 복사 위험
 *  - clone()은 new 키워드를 사용하지 않기 때문에, 생성자에 있는 로직이 실행되지 않음
 *    - ex) 로깅, 초기화 등 필수 코드가 누락될 수 있음
 *
 * 4. clone() 메서드는 예외를 던짐
 *  - CloneNotSupportedException 예외 처리를 항상 해야 해서 코드가 지저분해질 수 있음
 *
 * *
 */
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);  // https://github,com/whiteship/live-study/issues/1

        // 인스턴스 복사 - Deep Copy
        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone);

        repository.setUser("LEE");

        System.out.println(clone != githubIssue);    // ture
        System.out.println(clone.equals(githubIssue));  // false
        System.out.println(clone.getClass() == githubIssue.getClass());  // true
        System.out.println(clone.getRepository() == githubIssue.getRepository());   // false

        System.out.println(clone.getUrl());   // https://github,com/whiteship/live-study/issues/1
    }
}
