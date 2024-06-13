import java.util.ArrayList;

public class TestCafe {


    public static void main(String[] args) {
        CafeUtil cafeUtil = new CafeUtil();
        
        int StreakGoal = cafeUtil.getStreakGoal();
        System.out.println(StreakGoal);

        int StreakGoal1 = cafeUtil.getStreakGoal(9);
        System.out.println(StreakGoal1);

        double[] prices = {3.5, 4.0, 2.5, 5.0};
        double orderTotal =  cafeUtil.getOrderTotal(prices);
        System.out.println(orderTotal);


        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("drip coffee");
        menuItems.add("cappuccino");
        menuItems.add("latte");
        menuItems.add("mocha");

    
        cafeUtil.displayMenu(menuItems);



        ArrayList<String> customers = new ArrayList<String>();
        customers.add("Ola");
        cafeUtil.addCustomer(customers);



    }


    
    
}
