package _02_structural_patterns._08_composite._02_after;

public class Character implements Component {

    private Bag bag;

    public Character(Bag bag) {
        this.bag = bag;
    }

    @Override
    public int getPrice() {
        return bag.getPrice();
    }
}
