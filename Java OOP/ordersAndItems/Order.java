import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items;

    public Order(String name, boolean ready, ArrayList<Item> items){
        for(Item item : items){
            this.total += item.price;
        }
        this.name = name;
        this.items = items;
        this.ready = ready;
    }

    public void setOrderReadyStatus(boolean status){
        this.ready = status;
    }
}