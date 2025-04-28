import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
    }

    public static List<Book> readBooks(String file){
        List<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                .map(line -> line.split(","))
                .map(line -> new Book(
                    line[0], 
                    Integer.valueOf(line[1]), 
                    Integer.valueOf(line[2]), 
                    line[3]))
                .forEach(book -> books.add(book));
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return books;
    }
}
