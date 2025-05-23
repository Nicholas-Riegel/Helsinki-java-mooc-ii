import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        // test your method here

        List<Integer> list = new ArrayList<>();

        list.add(-3);
        list.add(7);
        list.add(-4);
        list.add(2);
        list.add(6);
        
        System.out.println(positive(list));
        
    }
    public static List<Integer> positive(List<Integer> numbers){
        // return numbers.stream().filter(i -> i > 0).collect(Collectors.toList());
        return numbers.stream().filter(i -> i > 0).collect(Collectors.toCollection(ArrayList::new));
    }

}
