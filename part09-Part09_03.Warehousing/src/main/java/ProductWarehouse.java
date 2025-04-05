public class ProductWarehouse extends Warehouse {

    private String productName;

    // - Creates an empty product warehouse. The name of the product and the capacity of the warehouse are provided as parameters.
    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.productName = productName;
    } 

    // - Returns the name of the product.
    public String getName(){
        return productName;
    } 

    // - sets a new name for the product.
    public void setName(String newName){
        productName = newName;
    } 
    
    // - Returns the state of the object represented as a string like this Juice: balance = 64.5, space left 123.5
    @Override
    public String toString(){
        return productName + ": " + super.toString();
    } 
}
