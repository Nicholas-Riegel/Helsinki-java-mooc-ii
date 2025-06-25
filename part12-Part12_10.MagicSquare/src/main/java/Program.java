
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(3));

        // int[][] arr = {
        //     {8, 1, 6},
        //     {3, 5, 7},
        //     {4, 9, 2}
        // };
        
        // int[][] arr2 = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        // MagicSquare ms = new MagicSquare(arr2);
        // String s = "";
        // // for (int num: ms.sumsOfRows()){
        // // for (int num: ms.sumsOfColumns()){
        // for (int num: ms.sumsOfDiagonals()){
        //     s += num + ", ";
        // }
        // System.out.println(s);
    }
}
