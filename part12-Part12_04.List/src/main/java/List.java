public class List<Type> {

    private Type[] values;
    private int firstFreeIndex;

    @SuppressWarnings("unchecked")
    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        
        if(this.firstFreeIndex == this.values.length) {
            grow();
        }

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++; 
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