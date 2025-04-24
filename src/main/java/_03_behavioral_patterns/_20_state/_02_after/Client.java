package _03_behavioral_patterns._20_state._02_after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student1 = new Student("LEE");
        Student student2 = new Student("SUB");
        student2.addPrivate(onlineCourse);

        onlineCourse.addStudent(student1);

        onlineCourse.changeState(new Private(onlineCourse));

        onlineCourse.addReview("hello", student1);

        onlineCourse.addStudent(student2);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());
    }
}
