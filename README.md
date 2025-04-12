# GoF 디자인 패턴 정리

> ### Gof 디자인 패턴 정리본 <br>
> 기간: 25.03.24(월) ~   <br>
> Reference: [ 코딩으로 학습하는 GoF의 디자인 패턴](https://www.inflearn.com/course/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4/dashboard)

<br>


 ###  Chapter 1: 생성 관련 패턴

- **1.싱글톤 패턴**
    - [:memo: 구현 1](/src/main/java/_01_creational_patterns/_01_singleton/v1/Settings.java): 가장 단순한 구현
    - [:memo: 구현 2](/src/main/java/_01_creational_patterns/_01_singleton/v2/Settings.java): synchronized
    - [:memo: 구현 3](/src/main/java/_01_creational_patterns/_01_singleton/v3/Settings.java): eager initialization
    - [:memo: 구현 4](/src/main/java/_01_creational_patterns/_01_singleton/v4/Settings.java): double checked locking
    - [:memo: 구현 5](/src/main/java/_01_creational_patterns/_01_singleton/v5/Settings.java): inner static class [권장]
    - [:memo: 구현 6](/src/main/java/_01_creational_patterns/_01_singleton/v6/Settings.java): enum [권장]

- **2. 팩토리 메서드 패턴**
  - [:memo: 기본 예제](/src/main/java/_01_creational_patterns/_02_factory_method/_01_before) 
  - [:memo: 팩토리 메서드 패턴 적용](/src/main/java/_01_creational_patterns/_02_factory_method/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_01_creational_patterns/_02_factory_method/_03_java)
  

  
- **3. 추상 팩토리 패턴**
  - [:memo: 기본 예제 - 문제점](/src/main/java/_01_creational_patterns/_03_abstract_factory/_01_before/WhiteshipFactory.java)
  - [:memo: 추상 팩토리 패턴 적용](/src/main/java/_01_creational_patterns/_03_abstract_factory/_02_after/ShipInventory.java)
  - [:memo: 실무 활용 예제](/src/main/java/_01_creational_patterns/_03_abstract_factory/_03_java/spring)

- **4. 빌더 패턴**
  - [:memo: 기본 예제 - 문제점](/src/main/java/_01_creational_patterns/_04_builder/_01_before/App.java)
  - [:memo: 빌더 패턴 적용](/src/main/java/_01_creational_patterns/_04_builder/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_01_creational_patterns/_04_builder/_03_java)

- **5. 프로토타입 패턴**
  - [:memo: 프로토타입 패턴 적용](/src/main/java/_01_creational_patterns/_05_prototype/_02_after/App.java)
  - [:memo: 실무 활용 예제](/src/main/java/_01_creational_patterns/_05_prototype/_03_java)

###  Chapter 2: 구조 관련 패턴

> 각 패턴에 대한 설명은 노션 페이지 참조

- **6. 어댑터 패턴**
  - [:memo: 어댑터 패턴 적용](/src/main/java/_02_structural_patterns/_06_adapter/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_02_structural_patterns/_06_adapter/_03_java)

- **7. 브릿지 패턴**
  - [:memo: 기본 예제 - 문제점](/src/main/java/_02_structural_patterns/_07_bridge/_01_before)
  - [:memo: 브릿지 패턴 적용](/src/main/java/_02_structural_patterns/_07_bridge/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_02_structural_patterns/_07_bridge/_03_java)

- **8. 컴포짓 패턴**
  - [:memo: 기본 예제](/src/main/java/_02_structural_patterns/_08_composite/_01_before)
  - [:memo: 컴포짓 패턴 적용](/src/main/java/_02_structural_patterns/_08_composite/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_02_structural_patterns/_08_composite/_03_java/SwingExample.java)
  
- **9. 데코레이션 패턴**
  - [:memo: 기본 예제](/src/main/java/_02_structural_patterns/_09_decorator/_01_before)
  - [:memo: 컴포짓 패턴 적용](/src/main/java/_02_structural_patterns/_09_decorator/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_02_structural_patterns/_09_decorator/_03_java)

- **10. 퍼사드 패턴**
  - [:memo: 기본 예제](/src/main/java/_02_structural_patterns/_10_facade/_01_before)
  - [:memo: 컴포짓 패턴 적용](/src/main/java/_02_structural_patterns/_10_facade/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_02_structural_patterns/_10_facade/_03_java)

###  Chapter 3: 행동 관련 패턴





<br>

```
Template
- **1.싱글톤 패턴**
    - [:memo: 구현 1](/src/_01_creational_patterns._01_singleton/v1/Settings.java): 가장 단순한 구현
```
