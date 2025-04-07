package _02_structural_patterns._08_composite._01_before;

public class Client {

    public static void main(String[] args) {
        Item item1 = new Item("아이템1", 450);
        Item item2 = new Item("아이템2", 300);

        Bag bag = new Bag();
        bag.add(item1);
        bag.add(item2);

        Client client = new Client();
        client.printPrice(item1);
        client.printPrice(bag);
    }

    private void printPrice(Item item) {
        System.out.println("arg: Item");
        System.out.println(item.getPrice());
    }

    private void printPrice(Bag bag) {
        System.out.println("arg: Bag");
        bag.getItems();
    }
}
