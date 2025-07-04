
public class List<Type> {

    private Type[] values;
    private int firstFreeIndex;

    @SuppressWarnings("unchecked")
    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }
    
    private void grow() {

        int newSize = this.values.length + this.values.length / 2;
        
        @SuppressWarnings("unchecked")
        Type[] newValues = (Type[]) new Object[newSize];
        
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }

    public void add(Type value) {
        
        if (this.firstFreeIndex == this.values.length){
            grow();
        }

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++; 
    }

    public int indexOfValue(Type value) {
        
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }
    
    public void remove(Type value) {
        
        int indexOfValue = indexOfValue(value);
        
        if (indexOfValue < 0) {
            return; // not found
        }

        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }

    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }

    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }

        return this.values[index];
    }

    public int size() {
        return this.firstFreeIndex;
    }
    
    @Override
    public String toString(){
        String string = "";
        for (Type x : values){
            if (x != null){
                string += x.toString() + ", ";
            }
        }
        return string;
    }
}