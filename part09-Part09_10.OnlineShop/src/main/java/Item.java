public class Item {

    private String name;
    private int quantity;
    private int unitPrice;

    // a constructor that creates an item corresponding to the product given as a parameter. qty tells us how many of the product are in the item, while unitPrice is the price of a single product.
    public Item(String product, int qty, int unitPrice){
        this.name = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    } 
    
    // return the price of the item. You get the items price by multiplying its unit price by its quantity(qty).
    public int price(){
        return unitPrice * quantity;
    } 

    // increases the quantity by one.
    public void increaseQuantity(){
        quantity++;
    } 

    // returns the string representation of the item. which must match the format shown in the example below.
    public String toString(){
        return name + ": " + quantity;
    } 
}
