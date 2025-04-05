public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory;

    // creates a product warehouse. The product name, capacity, and initial balance are provided as parameters.
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        changeHistory = new ChangeHistory();
        changeHistory.add(getBalance());
    }

    // works just like the method in the Warehouse class, but we also record the changed state to the history. NB: the value recorded in the history should be the warehouse's balance after adding, not the amount added!
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        changeHistory.add(getBalance());
    } 

    // works just like the method in the Warehouse class, but we also record the changed state to the history. NB: the value recorded in the history should be the warehouse's balance after removing, not the amount removed!
    @Override
    public double takeFromWarehouse(double amount){
        double amountTaken = super.takeFromWarehouse(amount);
        changeHistory.add(getBalance());
        return amountTaken;
    } 

    // which prints history related information for the product in the way presented in the example.
    public void printAnalysis(){
        System.out.println(
            "Product: " + getName() + 
            "\nHistory: " + history() +
            "\nLargest amount of product: " + changeHistory.maxValue() +
            "\nSmallest amount of product: " + changeHistory.minValue() +
            "\nAverage: " + changeHistory.average()
        );
    } 

    // returns the product history like this [0.0, 119.2, 21.2]. Use the string representation of the ChangeHistory object as is.
    public String history(){
        return changeHistory.toString();
    }
}
