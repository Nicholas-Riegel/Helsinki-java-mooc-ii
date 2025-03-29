
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {

            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }

            String[] inputArray = input.split(" ");
            String command = inputArray[0];
            int amount = Integer.valueOf(inputArray[1]);

            if (command.equals("add")){
                first.add(amount);
            }

            if (command.equals("remove")){
                second.remove(amount);
            }

            if (command.equals("move")){
                int pouredOut;
                if (amount > first.contains()){
                    pouredOut = first.contains();
                    first.remove(first.contains());
                } else {
                    first.remove(amount);
                    pouredOut = amount;
                }
                second.add(pouredOut);
            }
        }
    }
}
