package _03_behavioral_patterns._17_mediator._02_after;

import java.time.LocalDateTime;

public class Guest {
    private Integer id;
    private FrontDesk frontDest = new FrontDesk();

    public void getTowers(int numberOfTowers) {
        this.frontDest.getTowers(this, numberOfTowers);
    }

    private void dinner(LocalDateTime dateTime) {
        this.frontDest.dinner(this, dateTime);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
