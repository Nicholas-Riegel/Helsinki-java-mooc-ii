public class Container {

    private String name;
    private int levelFilledTo;

    public Container(String name){
        this.name = name;
        levelFilledTo = 0;
    }

    public int getLevelFilled(){
        return levelFilledTo;
    }

    public void add(int amountToAdd){
        
        if (amountToAdd < 0){
            return;
        }

        if (levelFilledTo + amountToAdd > 100){
            levelFilledTo = 100;
        } else {
            levelFilledTo += amountToAdd;
        }
    }

    public int remove(int amountToRemove){
        int amountRemoved;
        if (amountToRemove < 0){
            return 0;
        }
        if (amountToRemove > levelFilledTo){
            amountRemoved = levelFilledTo;
            levelFilledTo = 0;
        } else {
            levelFilledTo -= amountToRemove;
            amountRemoved = amountToRemove;
        }
        return amountRemoved;
    }

    public void move(int amountToMove, Container containerToMoveTo){
        if (amountToMove < 0){
            return;
        }
        int amountRemoved = this.remove(amountToMove);
        containerToMoveTo.add(amountRemoved);
    }

    public String toString(){
        return this.name + ": " + levelFilledTo + "/100";
    }
}