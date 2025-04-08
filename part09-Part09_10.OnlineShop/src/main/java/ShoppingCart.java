import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> contents;

    public ShoppingCart(){
        contents = new HashMap<>();
    }

    // adds an item to the cart that matches the product given as a parameter, with the price given as a parameter.
    public void add(String product, int price){
        if (contents.keySet().contains(product)){
            contents.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            contents.put(product, item);
        }
    } 

    // returns the total price of the shopping cart.
    public int price(){
        int total = 0;
        for (Item it : contents.values()){
            total += it.price();
        }
        return total;
    } 

    public void print(){
        for (Item it : contents.values()){
            System.out.println(it);
        }
    }
}
