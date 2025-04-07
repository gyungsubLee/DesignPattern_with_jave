package _02_structural_patterns._08_composite._01_before;

import java.util.ArrayList;
import java.util.List;

public class Bag {

    private final List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItem() {
        return items;
    }

    public void getItems() {
        items.forEach(item-> System.out.println(item.getPrice()));
    }

}
