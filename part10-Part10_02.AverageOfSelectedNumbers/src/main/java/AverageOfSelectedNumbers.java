
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        // toteuta ohjelmasi tänne

        //Implement a program, which reads user input. If the user input is "end", program stops reading input. The rest of the input is numbers.

        // Then user is asked if the program should print the average of all the positive numbers, or the average of all the negative numbers (n or p). If the user selects "n", the average of all the negative numbers is printed. Otherwise the average of all the positive numbers is printed.
        
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

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");

        String answer = scanner.nextLine();

        if (answer.equals("n")){

            double result = stringNums
                .stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(i -> i < 0)
                .average()
                .getAsDouble();
        
            System.out.println("Average of the negative numbers: " + result);
        }
        
        if (answer.equals("p")){
            
            double result = stringNums
                .stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(i -> i > 0)
                .average()
                .getAsDouble();
            
            System.out.println("Average of the positive numbers: " + result);
        }
    }
}
