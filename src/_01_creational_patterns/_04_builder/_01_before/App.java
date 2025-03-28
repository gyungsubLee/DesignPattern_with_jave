package _01_creational_patterns._04_builder._01_before;

import java.time.LocalDate;


/** 해당 코드의 문제점
 * 1. 객체 생성이 복잡하고 가독성이 떨어진다.
 *   - setter 를 통해 값을 설정하기 때문에 필드 값이 누락될 수 있음
 *   - 어떤 값이 필수이고 선택인지 명확하지 않음
 *
 * 2. 불변(immutable) 객체를 만들기 어렵다.
 *   - setter를 통한 값 초기화이기 때문에, 값이 언제든지 변경 가능하다 .
 *   - 멀티 스레딩 환경에서 특히 위험
 *
 * 🧐 의문점 )
 * 그렇다면 생성자를 사용하여 해결할 수 있지 않나? 굳이 빌더 패턴을 사용해서 중간 객체를 하나 더 만들어야 하나?
 *
 * 생성자를 사용한다면 불별성 문제를 해결할 수 있지만, 세팅해야 하는 필드 값이 많아질수록 가독성이 떨어지며 유연성 및 확정성이 낮다.
 * 또한 매개변수의 순서를 강제한다.
 * 만약 인자 순서를 잘못 입력하면 잘못된 값이 할당 될 수 있는데
 * 동일한 타입을 가지는 매개변수인 경우인 경우, 잘못된 값이 들어가도 컴파일 오류를 발생 시키지 않기 때문에 추적하기 어려운 오류를 발생시킨다.
 *
 * 이를 빌더 패턴 사용을 통해 해결할 수 있다.
 *  -> 발더 라는 중간 객체를 만들어 setter를 통해 값을 할당한다.
 *     내부적으로 생성자를 사용하여 실제 객체를 생성하기 때문에 불변성을 유지할 수 있으며,
 *     체이닝을 사용하기 때문에 가독성 측면에서도 뛰어나다.
 *     또한 setter를 사용한 값 세팅이기 때문에 인자 순서도 무시한다.
 *
 *     '🧐 setter를 사용하기 때문에 NPE가 발생될 수 있지 않나?' 라는 의문점이 생길 수 있는데,
 *      해당 부분도 여러 팁을 통해서 필수값을 강제할 수 있다.
 *      - 빌더 내부 필드에 final 키워드 사용
 *      - 실제 객체를 만드는 build() 메서드 내부에서 유효성 검사 진행
 *      - 롬복 사용 시 - 생성자에 @Builder 사용, @NonNnull을 통한 유효성 검사, @Builder.Default를 통한 기본값 설정 등
 */

public class App {

    public static void main(String[] args) {
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("오레곤 롱비치 여행");
        shortTrip.setStartDate(LocalDate.of(2021, 7, 15));


        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");
        tourPlan.addPlan(0, "체크인 이후 짐풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 부페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
        tourPlan.addPlan(1, "리조트 수영장에서 놀기");
        tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크");
        tourPlan.addPlan(2, "조식 부페에서 식사");
        tourPlan.addPlan(2, "체크아웃");


        for (DetailPlan plan : tourPlan.getPlans()) {
            System.out.println("Day: " + plan.getDay() + ", plan - " + plan.getPlan());
        }
    }
}

