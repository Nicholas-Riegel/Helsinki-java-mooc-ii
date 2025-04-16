
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// Write a program that reads user input. When the user gives a negative number as an input, the input reading will be stopped. After this, print all the numbers the user has given as input that are between 1 and 5.


public class LimitedNumbers {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        while (true) {
            
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0){
                break;
            }
            nums.add(input);
        }

        nums.stream().filter(i -> i >= 1 && i <= 5).forEach(x -> System.out.println(x));        
    }
}
