package _03_behavioral_patterns._20_state._02_after;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Published implements State {

    private final OnlineCourse onlineCourse;

    @Override
    public void addReview(String review, Student student) {
        this.onlineCourse.getReviews().add(review);
    }

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.getStudents().add(student);
    }
}
