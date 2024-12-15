public class Test {
    public static void main(String[] args) {
        Item item1 = new Item("Mocha", 1.5);
        Item item2 = new Item("Latte", 2);
        Item item3 = new Item("Drip Coffee", 3);
        Item item4 = new Item("Cappuccino", 3.5);

        Order order1 = new Order("Cindhuri");
        order1.addItem(item1);
        order1.addItem(item3);
        
        Order order2 = new Order("Jimmy");
        order2.addItem(item2);
        order2.addItem(item4);

        Order order3 = new Order("Noah");
        order3.addItem(item3);
        order3.addItem(item2);

        Order order4 = new Order("Sam");
        order4.addItem(item1);
        order4.addItem(item4);


        order1.display();
        System.out.println("\n");
        order2.display();
        System.out.println("\n");
        order3.display();
        System.out.println("\n");
        order4.display();
        System.out.println("\n");
        
    }
}
