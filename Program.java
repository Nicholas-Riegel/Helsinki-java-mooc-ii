import java.util.List;
public class Statistics {
    private List<Integer> numbers;
    public void add(int number) {
        this.numbers.add(number);
    }
    public double average() {
        return this.numbers.stream().mapToInt(i -> i).average().getAsDouble();
    }
}
public class Program{
    public static void main(String[] args) {
        Statistics st = new Statistics();
        System.out.println("Printing the average of the statistics: " + st.average());
        System.out.println("Adding number 22");
        st.add(22);
        System.out.println("Printing the average of the statistics: " + st.average());
    }
}