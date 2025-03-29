package _01_creational_patterns._04_builder._02_after.client;

import _01_creational_patterns._04_builder._01_before.TourPlan;
import _01_creational_patterns._04_builder._02_after.DefaultTourBuilder;
import _01_creational_patterns._04_builder._02_after.TourPlanBuilder;

import java.time.LocalDate;

/** 빌더 패턴 적용
 * ✅ 장점
 * 1. 체이닝을 통한 가독성 향샹
 * 2. 코드 유연성 및 확장성이 뛰어남
 * 3. 불변성 - 실제 인스턴스를 생성자를 통해 생성됨
 * 4. 인스턴스 생성 시, 인자 순서를 무시 가능 - 빌더 객체의 setter 를 통해 생성
 *
 * 🤬단점
 * 1. 미미하지만, builder 인스턴스를 생성하기 때문에 메모리 낭비가 발생됨
 * 2. 빌더 객체에 대한 설계가 추가로 필요함
 * 3. 내부 필드 값을 강제하기 위한 추가 조치가 필요함
 */
public class BuilderExample {

    public static void main(String[] args) {
        TourPlanBuilder tourBuilder = new DefaultTourBuilder();

        TourPlan cancunTrip = tourBuilder
                .title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2025, 3, 28))
                .whereToStay("게스트하우스")
                .addPlan(0, "공항도착")
                .addPlan(0, "체크인 및 짐 풀기")
                .addPlan(1, "맛집 탐방")
                .getPlan();

        System.out.println(cancunTrip.toString());

        TourPlan longBeachTrip = tourBuilder
                .title("롱비치")
                .startDate(LocalDate.of(2025, 8, 25))
                .getPlan();

        System.out.println(longBeachTrip.toString());
    }
}
