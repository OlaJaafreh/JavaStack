import java.util.ArrayList;

public class Order {

    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;
    private int orderTotal;
    // private double price;

    public Order(){
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

    public double getTotal() {

        return this.total;
    }

    // public void setTotal(double total) {
    //     this.total = total;
    // }

    public boolean isReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(Item item) {
        this.items.add(item);
        // this.price = item.getPrice();
        this.total += item.getPrice();
        this.orderTotal+=1;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name ;
    }


}
