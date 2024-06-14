import java.util.ArrayList;

public class CoffeeKiosk {
    
private ArrayList<Item> menu;
private static int menuIndex = 0;
private ArrayList<Order> orders;

public CoffeeKiosk() {
    this.menu =new ArrayList<>();
    this.orders =new ArrayList<>();
}

public void addMenuItem(String name, double price){
    Item item = new Item(name,price);
    this.menuIndex +=1;
    this.menu.add(item);
}

public void addMenuItem(){
    System.out.println("Please enter a name of the item");
    String name = System.console().readLine();
    System.out.println("Please enter a price of the item");
    String price = System.console().readLine();
    Item item = new Item(name,Double.parseDouble(price) );
    this.menuIndex +=1;
    this.menu.add(item);
}

public void newOrder() {
        
    // Shows the user a message prompt and then sets their input to a variable, name
    System.out.println("Please enter customer name for new order:");
    String name = System.console().readLine();

    // Your code:
    // Create a new order with the given input string
    Order order = new Order(name);
    // Show the user the menu, so they can choose items to add.
    displayMenu();
    
    // Prompts the user to enter an item number
    System.out.println("Please enter a menu item index or q to quit:");
    String itemNumber = System.console().readLine();
    int counter=0;
    
    
    // Write a while loop to collect all user's order items
    while(!itemNumber.equals("q")) {
        Item item= this.menu.get(Integer.parseInt(itemNumber));
        order.addItem(item);
        
        // Get the item object from the menu, and add the item to the order
        orders.add(order);
        // Ask them to enter a new item index or q again, and take their input
        System.out.println("Please enter a menu item index or q to quit:");
        itemNumber = System.console().readLine();
        counter++;
    }
    // After you have collected their order, print the order details 
    System.out.println(" ");
    System.out.println(String.format("Thank you,%s. Here are your order details:\n\nCustomer Name: %s",order.getName(),order.getName()));
    for (int i = 0; i < counter; i++) {
        System.out.println(String.format("%s - $%f", order.getItems().get(i).getName(), order.getItems().get(i).getPrice()));
    }
    System.out.println(String.format("Total: %f\n",order.getOrderTotal()));

}



public void displayMenu(){

    for (int i = 0; i < this.menuIndex; i++) {
        System.out.println(String.format("%d %s -- $%f\n", i, this.menu.get(i).getName(), this.menu.get(i).getPrice()));
    }
}




}
