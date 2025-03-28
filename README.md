# GoF 디자인 패턴 정리

> ### Gof 디자인 패턴 정리본 <br>
> 기간: 25.03.24(월) ~   <br>
> Reference: [ 코딩으로 학습하는 GoF의 디자인 패턴](https://www.inflearn.com/course/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4/dashboard)

<br>


 ###  Chapter 1: 생성 구조 패턴

- **1.싱글톤 패턴**
    - [:memo: 구현 1](/src/_01_creational_patterns/_01_singleton/v1/Settings.java): 가장 단순한 구현
    - [:memo: 구현 2](/src/_01_creational_patterns/_01_singleton/v2/Settings.java): synchronized
    - [:memo: 구현 3](/src/_01_creational_patterns/_01_singleton/v3/Settings.java): eager initialization
    - [:memo: 구현 4](/src/_01_creational_patterns/_01_singleton/v4/Settings.java): double checked locking
    - [:memo: 구현 5](/src/_01_creational_patterns/_01_singleton/v5/Settings.java): inner static class [권장]
    - [:memo: 구현 6](/src/_01_creational_patterns/_01_singleton/v6/Settings.java): enum [권장]

- **2. 팩토리 메서드 패턴**
  - [기본 예제](/src/_01_creational_patterns/_02_factory_method/_01_before) 
  - [:memo: 팩토리 메서드 패턴 적용](/src/_01_creational_patterns/_02_factory_method/_02_after)
      <details>
        <summary>팩토리 메서드 패턴 적용을 통해 얻는 이점</summary>
        - 객체 생성 책임 분리<br/>
        - OCP 준수<br/>
          ✲ OCP: '확장'에는 열려있고, '변경'에는 닫혀있어야 한다.'<br>
           → '다형성', '상속', '캡슐화'
      </details>
    
  - [:memo: 실무 활용 예시](/src/_01_creational_patterns/_02_factory_method/_03_java)
  
    - 매개변수를 통해 동적으로 특정 인스턴스 생성
  
- **3. 추상 팩토리 패턴**
  - [:memo: 기본 예제 - 문제점](/src/_01_creational_patterns/_03_abstract_factory/_01_before/WhiteshipFactory.java)
  - [:memo: 추상 팩토리 패턴 적용](/src/_01_creational_patterns/_03_abstract_factory/_02_after/ShipInventory.java)
  - [:memo: 실무 활용 예시](/src/_01_creational_patterns/_03_abstract_factory/_03_java/spring)

- **4. 빌더 패턴**
  - [:memo: 기본 예제 - 문제점](/src/_01_creational_patterns/_04_builder/_01_before/App.java)
  - [:memo: 빌더 패턴 적용](/src/_01_creational_patterns/_04_builder/_02_after)
  

###  Chapter 2: 구조 관련 패턴


###  Chapter 3: 행동 관련 패턴





<br>

```
Template
- **1.싱글톤 패턴**
    - [:memo: 구현 1](/src/_01_creational_patterns._01_singleton/v1/Settings.java): 가장 단순한 구현
```
