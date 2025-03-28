
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String input = scanner.nextLine();
                if (input.equals("end")){
                    break;
                }
                int answer = Integer.valueOf(input);
                System.out.println( (int) Math.pow(answer, 3));    
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}
