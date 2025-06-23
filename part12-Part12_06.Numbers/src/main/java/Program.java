
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String response = scanner.nextLine();
            if (response.isEmpty()){
                break;
            }
            int number = Integer.valueOf(response);

            while (number > 0){
                System.out.println(rand.nextInt(11));
                number--;
            }
        }
    }

}
