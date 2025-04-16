
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> inputs = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()){
                break;
            }
            inputs.add(input);
        }

        // String response = inputs.stream().reduce("", (prev, i) -> prev + i + "\n");
        // System.out.println(response);
        
        inputs.stream().forEach(i -> System.out.println(i));
    }
}
