package _03_behavioral_patterns._20_state._01_before;

public class Client {

    public static void main(String[] args) {
        Student student = new Student("LEE");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student gyungsub = new Student("gyungsub");
        gyungsub.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        onlineCourse.addStudent(gyungsub);

        onlineCourse.addReview("hello", student);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
