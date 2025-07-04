public class Program {

    public static void main(String[] args) {

        // you may try out your class here

        // Pipe<String> pipe = new Pipe<>();
        // pipe.putIntoPipe("dibi");
        // pipe.putIntoPipe("dab");
        // pipe.putIntoPipe("dab");
        // pipe.putIntoPipe("daa");
        // while(pipe.isInPipe()) {
        //     System.out.println(pipe.takeFromPipe());
        // }

        Pipe<Integer> numberPipe = new Pipe<>();

        numberPipe.putIntoPipe(1);
        numberPipe.putIntoPipe(2);
        numberPipe.putIntoPipe(3);

        int sum = 0;
        
        while(numberPipe.isInPipe()) {
            sum += numberPipe.takeFromPipe();
        }
        
        System.out.println(sum);
        System.out.println(numberPipe.takeFromPipe());
    }
}
