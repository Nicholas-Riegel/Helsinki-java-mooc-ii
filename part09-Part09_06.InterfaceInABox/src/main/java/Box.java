import java.util.ArrayList;

public class Box implements Packable {

    private double capacity;
    private ArrayList<Packable> contents;

    public Box(double capacity){
        this.capacity = capacity;
        this.contents = new ArrayList<>();
    }

    public void add(Packable item){
        if (capacity - item.weight() >= 0){
            contents.add(item);
            capacity -= item.weight();
        }
    }

    public double weight(){
        double totalWeight = 0;
        for (Packable item : contents){
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString(){
        return "Box: " + contents.size() + " items, total weight " + weight() + " kg"; 
    }
}
