# GoF 디자인 패턴 정리

> ### Gof 디자인 패턴 정리본 <br>
> 기간: 25.03.24(월) ~   <br>
> Reference: [ 코딩으로 학습하는 GoF의 디자인 패턴](https://www.inflearn.com/course/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4/dashboard)



> ### NOTES: [노션 정리 페이지 ](https://beautiful-college-c84.notion.site/GoF-1c3eda9b0fe181c2b6eac9b4c4c77f6e?pvs=4)

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
  - [:memo: 데코레이션 패턴 적용](/src/main/java/_02_structural_patterns/_09_decorator/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_02_structural_patterns/_09_decorator/_03_java)

- **10. 퍼사드 패턴**
  - [:memo: 기본 예제](/src/main/java/_02_structural_patterns/_10_facade/_01_before)
  - [:memo: 퍼사드 패턴 적용](/src/main/java/_02_structural_patterns/_10_facade/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_02_structural_patterns/_10_facade/_03_java)
  - 
- **11. 플라이웨이트 패턴**
  - [:memo: 기본 예제](/src/main/java/_02_structural_patterns/_11_flyweight/_01_before)
  - [:memo: 플라이웨이트 패턴 적용](/src/main/java/_02_structural_patterns/_11_flyweight/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_02_structural_patterns/_11_flyweight/_03_java)

- **12. 프록시 패턴**
  - [:memo: 기본 예제](/src/main/java/_02_structural_patterns/_12_proxy/_01_before)
  - [:memo: 플라이웨이트 패턴 적용](/src/main/java/_02_structural_patterns/_12_proxy/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_02_structural_patterns/_12_proxy/_03_java)


###  Chapter 3: 행동 관련 패턴

- **13. 책임 연쇄 패턴**
  - [:memo: 기본 예제](/src/main/java/_03_behavioral_patterns/_13_chain_of_responsibilities/_01_before)
  - [:memo: 책임 연쇄 패턴 적용](/src/main/java/_03_behavioral_patterns/_13_chain_of_responsibilities/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_03_behavioral_patterns/_13_chain_of_responsibilities/_03_java)

- **14. 커맨드 패턴**
  - [:memo: 기본 예제](/src/main/java/_03_behavioral_patterns/_14_command/_01_before)
  - [:memo: 커맨드 패턴 적용](/src/main/java/_03_behavioral_patterns/_14_command/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_03_behavioral_patterns/_14_command/_03_java)

- **15. 인터프리터 패턴**
  - [:memo: 기본 예제](/src/main/java/_03_behavioral_patterns/_15_interpreter/_01_before)
  - [:memo: 인터프리터 패턴 적용](/src/main/java/_03_behavioral_patterns/_15_interpreter/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_03_behavioral_patterns/_15_interpreter/_03_java)

- **16. 이터레이터 패턴**
  - [:memo: 기본 예제](/src/main/java/_03_behavioral_patterns/_16_iterator/_01_before)
  - [:memo: 이터레이터 패턴 적용](/src/main/java/_03_behavioral_patterns/_16_iterator/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_03_behavioral_patterns/_16_iterator/_03_java)

- **17. 중재자 패턴**
  - [:memo: 기본 예제](/src/main/java/_03_behavioral_patterns/_17_mediator/_01_before)
  - [:memo: 중재자 패턴 적용](/src/main/java/_03_behavioral_patterns/_17_mediator/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_03_behavioral_patterns/_17_mediator/_03_java)

- **18. 메멘토 패턴**
  - [:memo: 기본 예제](/src/main/java/_03_behavioral_patterns/_18_memento/_01_before)
  - [:memo: 메멘토 패턴 적용](/src/main/java/_03_behavioral_patterns/_18_memento/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_03_behavioral_patterns/_18_memento/_03_java)

- **19. 옵저버 패턴**
  - [:memo: 기본 예제](/src/main/java/_03_behavioral_patterns/_19_observer/_01_before)
  - [:memo: 옵저버 패턴 적용](/src/main/java/_03_behavioral_patterns/_19_observer/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_03_behavioral_patterns/_19_observer/_03_java)

- **20. 상태 패턴**
  - [:memo: 기본 예제](/src/main/java/_03_behavioral_patterns/_20_state/_01_before)
  - [:memo: 상태 패턴 적용](/src/main/java/_03_behavioral_patterns/_20_state/_02_after)

- **21. 전략 패턴**
  - [:memo: 기본 예제](/src/main/java/_03_behavioral_patterns/_21_strategy/_01_before)
  - [:memo: 전략 패턴 적용](/src/main/java/_03_behavioral_patterns/_21_strategy/_02_after)
  - [:memo: 실무 활용 예제](/src/main/java/_03_behavioral_patterns/_21_strategy/_03_java)


- **22. 템플릿 메서드 패턴**
  - [:memo: 기본 예제](/src/main/java/_03_behavioral_patterns/_22_template/_01_before)
  - [:memo: 템플릿 메서드 패턴 적용](/src/main/java/_03_behavioral_patterns/_22_template/_02_after/method)
  - [:memo: 템플릿 콜백 패턴 적용](/src/main/java/_03_behavioral_patterns/_22_template/_02_after/callback)
  - [:memo: 실무 활용 예제](/src/main/java/_03_behavioral_patterns/_22_template/_03_java)
