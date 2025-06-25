
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // public MagicSquare(int[][] array){
    //     square = array;
    // }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        
        ArrayList<Integer> sums = new ArrayList<>();
        
        for (int row = 0; row < square.length; row++){
            int sum = 0;
            for (int col = 0; col < square[row].length; col++){
                sum += square[row][col];
                if (col == square[row].length - 1){
                    sums.add(sum);
                }
            }
        }
        return sums;
    }

    public ArrayList<Integer> sumsOfColumns() {
        
        ArrayList<Integer> sums = new ArrayList<>();
        
        for (int row = 0; row < square.length; row++){
            for (int col = 0; col < square[row].length; col++){
                if (row == 0){
                    sums.add(square[row][col]);
                } else {
                    int n = sums.get(col);
                    n += square[row][col];
                    sums.set(col, n);
                }
            }
        }
        return sums;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        
        ArrayList<Integer> sums = new ArrayList<>();
        sums.add(square[0][0]);
        sums.add(square[0][square[0].length - 1]);
        
        for (int row = 1; row < square.length; row++){

            // top left to bottom right
            int n0 = sums.get(0);
            n0 += square[row][row];
            sums.set(0, n0);
            
            // top right to bottom left
            int n1 = sums.get(1);
            n1 += square[row][square[row].length - (row + 1)];
            sums.set(1, n1);
        }
        return sums;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
