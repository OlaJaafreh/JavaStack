import java.util.ArrayList;

public class Order {

    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;
    private int orderTotal;
    // private double price;

    public Order(){
        this.name ="Guest";
        this.ready=false;
        this.total=0.0;
        // this.price=0.0;
        this.items = new ArrayList<>();
    }

    public Order(String name){
        this.ready=false;
        this.total=0.0;
        // this.price=0.0;
        this.name=name;
        this.items = new ArrayList<>();

    }

    // public double getTotal() {

    //     return this.total;
    // }

    // public void setTotal(double total) {
    //     this.total = total;
    // }

    public boolean isReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public String getStatusMessage() {
        if(this.ready == true){
           return  "Your order is ready";
        }
        else{
           return "Thank you for waiting. Your order will be ready soon";
        }
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void addItem(Item item) {
        this.items.add(item);
        // this.price = item.getPrice();
        // this.total += item.getPrice();
        // this.orderTotal+=1;
        
    }

    public double  getOrderTotal() {
       for (Item item : items) {
        this.total += item.getPrice();
        this.orderTotal+=1;
       }
       return this.total;
        // this.price = item.getPrice();
        
    }


    public String display(){
        StringBuilder orderInfo = new StringBuilder();

        orderInfo.append(String.format("Customer Name: %s", this.name));
        for (Item item : items) {
            orderInfo.append(String.format("%s: %f\n", item.getName(),item.getPrice()));
           }
           orderInfo.append(String.format("Total: $%f\n", this.total));

        return orderInfo.toString();

    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name ;
    }


}
