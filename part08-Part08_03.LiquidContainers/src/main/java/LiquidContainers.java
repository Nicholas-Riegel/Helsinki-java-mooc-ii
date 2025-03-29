import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Container first = new Container("First");
        Container second = new Container("Second");

        while (true) {

            System.out.println(first);
            System.out.println(second);
            
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
                first.move(amount, second);
            }
        }
    }

}
