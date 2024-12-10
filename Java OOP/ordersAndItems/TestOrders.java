import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item("Mocha", 2);
        Item item2 = new Item("Latte", 1);
        Item item3 = new Item("Drip Coffee", 2.5);
        Item item4 = new Item("Cappuccino", 4);

        ArrayList<Item> items1 = new ArrayList<>();
        items1.add(item1);
        items1.add(item2);
        Order order1 = new Order("Cindhuri", false, items1);

        ArrayList<Item> items2 = new ArrayList<>();
        items2.add(item2);
        items2.add(item4);
        Order order2 = new Order("Noah", true, items2);

        ArrayList<Item> items3 = new ArrayList<>();
        items3.add(item2);
        items3.add(item1);
        Order order3 = new Order("Jimmy", false, items3);

        ArrayList<Item> items4 = new ArrayList<>();
        items4.add(item3);
        items4.add(item4);
        Order order4 = new Order("Sam", true, items4);

        System.out.println("Order List:");
        System.out.println(order1.name);
        System.out.println(order1.total);
        System.out.println('\n');
        System.out.println(order2.name);
        System.out.println(order2.total);
        System.out.println('\n');
        System.out.println(order3.name);
        System.out.println(order3.total);
        System.out.println('\n');
        System.out.println(order4.name);
        System.out.println(order4.total);
    }
}