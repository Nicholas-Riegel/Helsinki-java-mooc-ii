import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity){
        maxWeight = capacity;
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item){
        if (maxWeight - item.getWeight() >= 0){
            items.add(item);
            maxWeight -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item){
        if (items.contains(item)){
            return true;
        }
        return false;
    }
}
