import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        
        Checker checker = new Checker();

        try (Scanner scanner = new Scanner(System.in)){

            while (true){
                System.out.print("Enter a string: ");
                String answer = scanner.nextLine();
                if (answer.isEmpty()){
                    break;
                }
                
                // if (checker.isDayOfWeek(answer)){
                // if (checker.allVowels(answer)){
                if (checker.timeOfDay(answer)){
                    System.out.println("The form is correct.");
                } else {
                    System.out.println("The form is incorrect.");
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
