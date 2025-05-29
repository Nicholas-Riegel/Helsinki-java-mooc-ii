//Implement a class called Hideout, which has a single generic type parameter. The object created from the class may only hide one object at a time. The class should provide a parameterless constructor as well as the following three methods:

import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {
    
    private List<T> thing;

    public Hideout(){
        thing = new ArrayList<>();
    }

    //puts an object with a type in accordance with the type parameter given to the the class into the hideout. In case an object is already in the hideout, it will disappear.
    public void putIntoHideout(T toHide){
        if (!thing.isEmpty()){
            thing.remove(0);
        }
        thing.add(toHide);
    }

    //takes out the object with a type in accordance with the type parameter given to the class from the hideout. In case there is nothing in the hideout, we return null. Calling the method returns the object in the hideout and removes the object from the hideout.
    public T takeFromHideout(){
        return thing.remove(0);
    } 
    
    //returns the value true if there is an object in the hideout. In case there isn't an object in the hideout, it should return the value false.
    public boolean isInHideout(){
        if (thing.isEmpty()){
            return false;
        }
        return true;
    } 
}
