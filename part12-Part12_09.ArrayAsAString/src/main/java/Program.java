
public class Program {

    public static String arrayAsString(int[][] array){

        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                sb.append(array[row][column]);
                if (column == array[row].length - 1){
                    sb.append("\n");
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Test your method here
        // int rows = 2;
        // int columns = 3;
        // int[][] matrix = new int[rows][columns];
        // matrix[0][1] = 5;
        // matrix[1][0] = 3;
        // matrix[1][2] = 7;
        // System.out.println(arrayAsString(matrix));

        int[][] matrix = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(arrayAsString(matrix));
    }

}
