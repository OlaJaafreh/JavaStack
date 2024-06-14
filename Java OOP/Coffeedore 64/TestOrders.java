public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items

        CoffeeKiosk menuItems = new CoffeeKiosk();

        menuItems.addMenuItem("mocha",1.5);
        menuItems.addMenuItem("latte",3);
        menuItems.addMenuItem("drip coffee",1.25);
        menuItems.addMenuItem("cappuccino",0.5);
        menuItems.addMenuItem("muffin",4);

        
        menuItems.displayMenu();
        menuItems.newOrder();

        menuItems.addMenuItem();
        menuItems.displayMenu();
        menuItems.newOrder();



        // Item item1 = new Item("mocha",1.5);
        // Item item2 = new Item("latte",3);
        // Item item3 = new Item("drip coffee",1.25);
        // Item item4 = new Item("cappuccino",0.5);

        // item1.setName("mocha");
        // item2.setName("latte");
        // item3.setName("drip coffee");
        // item4.setName("cappuccino");

        // item1.setPrice(1.5);
        // item2.setPrice(3);
        // item3.setPrice(1.25);
        // item4.setPrice(0.5);


        
    
        // // Order variables -- order1, order2 etc.
        // Order order1 = new Order();
        // Order order2 = new Order();
        // Order order3 = new Order();
        // Order order4 = new Order();
        // Order order5 = new Order();

        // order1.setName("Cindhuri");
        // order2.setName("Jimmy");
        // order3.setName("Noah");
        // // order4.setName("Sam");

        // order1.addItem(item1);
        // order1.addItem(item2);
        // order1.setReady(true);

        // order2.addItem(item1);
        // order2.setReady(true);

        // order3.addItem(item4);
        // order3.setReady(true);

        // order4.addItem(item2);
        // order4.addItem(item2);
        // order4.setReady(false);
    
        // // Application Simulations
        // // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.getName());
        // System.out.printf("Total: %s\n", order1.getOrderTotal());
        // System.out.printf("%s\n", order1.getStatusMessage());
        // System.out.printf("%s\n", order1.display());

        // System.out.printf("Name: %s\n", order2.getName());
        // System.out.printf("Total: %s\n", order2.getOrderTotal());
        // System.out.printf("%s\n", order2.getStatusMessage());
        // System.out.printf("%s\n", order2.display());

        // System.out.printf("Name: %s\n", order3.getName());
        // System.out.printf("Total: %s\n", order3.getOrderTotal());
        // System.out.printf("%s\n", order3.getStatusMessage());
        // System.out.printf("%s\n", order3.display());

        // System.out.printf("Name: %s\n", order4.getName());
        // System.out.printf("Total: %s\n", order4.getOrderTotal());
        // System.out.printf("%s\n", order4.getStatusMessage());
        // System.out.printf("%s\n", order4.display());

        // System.out.printf("Name: %s\n", order5.getName());
        // System.out.printf("Total: %s\n", order5.getOrderTotal());
        // System.out.printf("%s\n", order5.getStatusMessage());
        // System.out.printf("%s\n", order5.display());
    }
}