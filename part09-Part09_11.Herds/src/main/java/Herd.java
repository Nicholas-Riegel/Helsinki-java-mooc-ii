import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{

    private List<Movable> organisms;

    public Herd(){
        organisms = new ArrayList<>();
    }

    // Adds an object that implements the Movable interface to the herd.
    public void addToHerd(Movable movable){
        organisms.add(movable);    
    }

    // Moves the herd with by the amount specified by the parameters. Notice that here you have to move each member of the herd.
    public void move(int dx, int dy){
        for (Movable moves : organisms){
            moves.move(dx, dy);
        }    
    }
    
    // Returns a string representation of the positions of the members of the herd, each on its own line.
    public String toString(){
        String result = "";
        for (Movable moves : organisms){
            result += moves.toString() + "\n";
        }
        return result;
    }
}
