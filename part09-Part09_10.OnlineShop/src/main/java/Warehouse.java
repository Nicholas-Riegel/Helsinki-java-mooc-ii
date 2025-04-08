import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStocks;

    public Warehouse(){
        productPrices = new HashMap<>();
        productStocks = new HashMap<>();
    }

    // which adds a product to the warehouse with the price and stock balance given as parameters.
    public void addProduct(String product, int price, int stock){
        productPrices.put(product, price);
        productStocks.put(product, stock);
    } 

    // which returns the price of the product it received as a parameter. If the product hasn't been added to the warehouse, the method must return -99.
    public int price(String product){
        if (!productPrices.keySet().contains(product)){
            return -99;
        }
        return productPrices.get(product);
    } 
    
    // returns the current remaining stock of the product in the warehouse. If the product hasn't been added to the warehouse, the method must return 0.
    public int stock(String product){
        if (!productStocks.keySet().contains(product)){
            return 0;
        }
        return productStocks.get(product);
    } 

    // reduces the stock remaining for the product it received as a parameter by one, and returns true if there was stock remaining. If the product was not available in the warehouse the method returns false. A products stock can't go below zero.
    public boolean take(String product){
        if (productStocks.keySet().contains(product) && productStocks.get(product) > 0){
            productStocks.put(product, productStocks.get(product) - 1);
            return true;
        }
        return false;
    } 

    // returns the names of the products in the warehouse as a Set
    public Set<String> products(){
        return productPrices.keySet();
    } 
}
