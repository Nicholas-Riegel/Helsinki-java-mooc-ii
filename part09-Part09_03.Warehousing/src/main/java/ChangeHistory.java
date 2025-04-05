import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    // creates an empty ChangeHistory object.
    public ChangeHistory(){
        history = new ArrayList<>();
    } 
    
    // adds provided status as the latest amount to remember in the change history.
    public void add(double status){
        history.add(status);
    } 
    
    // empties the history.
    public void clear(){
        history.clear();
    } 

    // returns the largest value in the change history. If the history is empty, the method should return zero.
    public double maxValue(){
        if (history.size() == 0){
            return 0.0;
        }
        double max = history.get(0);
        for (double val : history){
            if (val > max){
                max = val;
            }
        }
        return max;
    } 
    
    // returns the smallest value in the change history. If the history is empty, the method should return zero.
    public double minValue(){
        if (history.size() == 0){
            return 0.0;
        }
        double min = history.get(0);
        for (double val : history){
            if (val < min){
                min = val;
            }
        }
        return min;
    } 
    
    // returns the average of the values in the change history. If the history is empty, the method should return zero.
    public double average(){
        if (history.size() == 0){
            return 0.0;
        }
        double sum = 0;
        for (double val : history){
            sum += val;
        }
        return sum / history.size();
    } 
    
    // returns the string representation of the change history. The string representation provided by the ArrayList class is sufficient.
    public String toString(){
        return history.toString();
    } 
}
