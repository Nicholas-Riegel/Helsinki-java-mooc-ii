import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> iouHashMap;

    // creates a new IOU
    public IOU() {
        iouHashMap = new HashMap<>();
    }
    
    // saves the amount owed and the person owed to to the IOU.
    public void setSum(String toWhom, double amount) {
        iouHashMap.put(toWhom, amount);
    }
    
    // returns the amount owed to the person whose name is given as a parameter. If the person cannot be found, it returns 0.
    public double howMuchDoIOweTo(String toWhom) {
        return iouHashMap.getOrDefault(toWhom, 0.0);
    }
}
