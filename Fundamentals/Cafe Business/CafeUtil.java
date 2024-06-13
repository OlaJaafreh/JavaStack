import java.util.ArrayList;

public class CafeUtil {

public int getStreakGoal() {

    int num =0;
    for(int i=1 ; i<=10 ; i++){
        num +=i;
    }
    return num;
}


public int getStreakGoal(int numWeeks) {

    int num =0;
    for(int i=1 ; i<=numWeeks ; i++){
        num +=i;
    }
    return num;
}


public double getOrderTotal(double[] prices) {

    double num =0.0;
    for(int i=0 ; i<=prices.length-1 ; i++){
        num +=prices[i];
    }
    return num;

}



public void displayMenu(ArrayList<String> menuItems) {

    for (int i = 0; i < menuItems.size(); i++) {
        System.out.println(i + " " + menuItems.get(i));
    }

    // ArrayList<Object> things = new ArrayList<Object>();
    // menuItems.add("drip coffee");
    // menuItems.add("cappuccino");
    // menuItems.add("latte");
    // menuItems.add("mocha");
    // String name = menuItems.get(0);
}



public void addCustomer(ArrayList<String> customers) {

    customers.add("username1");
    customers.add("username2");
    customers.add("username3");

    System.out.println("Please enter your name:");
    String username = System.console().readLine();
    System.out.printf("Hello, %s!\n", username);
    System.out.printf("There are %d people in front of you", customers.size());
    customers.add(username);

}





}