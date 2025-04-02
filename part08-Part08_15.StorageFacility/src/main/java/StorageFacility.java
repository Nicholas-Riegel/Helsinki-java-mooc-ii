import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility(){
        storage = new HashMap<>();
    }
    
    // adds the parameter item to the storage unit that is also given as a parameter.
    public void add(String unit, String item){
        storage.putIfAbsent(unit, new ArrayList<>());
        storage.get(unit).add(item);
    } 
    
    // removes the given item from the given storage unit. NB! Only removes one item — if there are several items with the same name, the rest still remain. If the storage unit would be empty after the removal, the method also removes the unit.
    public void remove(String storageUnit, String item){
        storage.get(storageUnit).remove(item);
        if (storage.get(storageUnit).isEmpty()){
            storage.remove(storageUnit);
        }
    } 
    
    // returns the names of the storage units as a list. NB! Only the units that contain items are listed.
    public ArrayList<String> storageUnits(){
        ArrayList<String> keys = new ArrayList<>();
        for(String key : storage.keySet()){
            if (storage.get(key).isEmpty()){
                continue;
            }
            keys.add(key);
        }
        return keys;
    } 

    // returns a list that contains all the items in the storage unit indicated by the parameter. If there is no such storage unit or it contains no items, the method should return an empty list.
    public ArrayList<String> contents(String storageUnit){
        if (storage.containsKey(storageUnit)){
            return storage.get(storageUnit);
        }
        return new ArrayList<>();
    } 
}
