public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.setName("mocha");
        item2.setName("latte");
        item3.setName("drip coffee");
        item4.setName("cappuccino");

        item1.setPrice(1.5);
        item2.setPrice(3);
        item3.setPrice(1.25);
        item4.setPrice(0.5);


        
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.setName("Cindhuri");
        order2.setName("Jimmy");
        order3.setName("Noah");
        order4.setName("Sam");

        order1.setItems(item1);
        order1.setItems(item2);
        order1.setReady(true);

        order2.setItems(item1);
        order2.setReady(true);

        order3.setItems(item4);
        order3.setReady(true);

        order4.setItems(item2);
        order4.setItems(item2);
        order4.setReady(true);
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.getName());
        System.out.printf("Total: %s\n", order1.getTotal());
        System.out.printf("Ready: %s\n", order1.isReady());

        System.out.printf("Name: %s\n", order2.getName());
        System.out.printf("Total: %s\n", order2.getTotal());
        System.out.printf("Ready: %s\n", order2.isReady());

        System.out.printf("Name: %s\n", order3.getName());
        System.out.printf("Total: %s\n", order3.getTotal());
        System.out.printf("Ready: %s\n", order3.isReady());

        System.out.printf("Name: %s\n", order4.getName());
        System.out.printf("Total: %s\n", order4.getTotal());
        System.out.printf("Ready: %s\n", order4.isReady());
    }
}