
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int x1 = size/2;
        int y1 = 0;
        
        for (int i = 1; i <= size * size; i++){
            
            square.placeValue(x1, y1, i);
            
            int x2 = x1;
            int y2 = y1;

            if (y2 - 1 >= 0){
                y2 = y2 - 1;
            } else {
                y2 = size - 1;
            }

            if (x2 + 1 <= size -1){
                x2 = x2 + 1;
            } else {
                x2 = 0;
            }

            if (square.readValue(x2, y2) != 0){
                y2 = y1;
                if (y2 == size - 1){
                    y2 = 0;
                } else {
                    y2 = y2 + 1;
                }
                y1 = y2;
            } else {
                y1 = y2;
                x1 = x2;
            }
        }

        return square;
    }

}
