public class Container {

    private int isFilledTo;

    public Container(){
        isFilledTo = 0;
    }

    // which returns the amount of liquid in a container as an integer.
    public int contains() {
        return isFilledTo;
    }

    // which adds the amount of liquid given as a parameter to the container. If the amount is negative, no liquid is added.
    // A container can hold maximum of 100 units of liquid.
    public void add(int amount) {
        if (amount < 0){
            return;
        }
        if (isFilledTo + amount > 100){
            isFilledTo = 100;
        } else {
            isFilledTo += amount;
        }
    }

    // which removes the amount of liquid given as a parameter from the container. If the amount is negative, no liquid is removed. A container can never hold less than 0 units of liquid.
    public void remove(int amount) {
        if (amount < 0){
            return;
        }
        if (amount > isFilledTo){
            isFilledTo = 0;
        } else {
            isFilledTo -= amount;
        }
    }

    // which returns the container as a string formatted "amount of liquid/100", for example "32/100".
    public String toString() {
        return isFilledTo + "/100";
    }
}
