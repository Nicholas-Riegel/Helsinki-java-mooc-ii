import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AverageOfNumbers {

    public static void main(String[] args) {
        // Write your program here
        
        //Implement a program, which reads user input. If the user input is "end", the program stops reading input. The rest of the input is numbers. When the user input is "end", the program prints the average of all of the numbers.
        
        Scanner scanner = new Scanner(System.in);
        List<String> stringNums = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            
            String input = scanner.nextLine();

            if (input.equals("end")){
                break;
            }

            stringNums.add(input);
        }

        double average = stringNums.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
        System.out.println("average of the numbers: " + average);
    }
}
