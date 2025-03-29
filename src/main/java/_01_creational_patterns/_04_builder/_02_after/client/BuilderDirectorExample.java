package _01_creational_patterns._04_builder._02_after.client;

import _01_creational_patterns._04_builder._01_before.TourPlan;
import _01_creational_patterns._04_builder._02_after.DefaultTourBuilder;
import _01_creational_patterns._04_builder._02_after.TourDirector;

/**
 * 자주 반복되는 빌더 프로세스의 경우
 * Director 를 통해 메서드로 추출하여 최적화 가능하다.
 *
 * ✅ 장점
 * 1. 복잡한 객체 생성 프로세스를 포장할수 있다.
 *
 * 2. 동일한 프로세스 가지는 경우, 구성(composition)을 통해 확장된 다른 객체들을 생성할 수 있다. => 전략 패턴
 * - ex) VIP 용 서비스, 외국인 전용 서비스 등...
 *     VIP 용 서비스 -> VIPTourPlanBuilder 로 확장하여 해당 인스턴스 생성
 *
 * ❗️단점
 *  1. director, builder 인스턴스를 생성해야 한다.
 *  2. 구조가 복잡하다.
 */
public class BuilderDirectorExample {
    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());

        TourPlan cancunTrip = tourDirector.cancunTrip();
        TourPlan longBeachTrip = tourDirector.longBeachTrip();

        System.out.println(longBeachTrip.toString());
        System.out.println(cancunTrip.toString());
    }
}
