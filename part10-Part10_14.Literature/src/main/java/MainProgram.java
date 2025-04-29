import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(System.in)) {
        
            while (true) {
                System.out.print("Input the name of the book, empty stops: ");
                String title = scanner.nextLine();
                if (title.isEmpty()){
                    break;
                }
                System.out.print("Input the age recommendation: ");
                String age = scanner.nextLine();
                if (age.isEmpty()){
                    break;
                }
                books.add(new Book(title, Integer.valueOf(age)));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        Comparator<Book> comparator = Comparator
            .comparing(Book::getAge)
            .thenComparing(Book::getTitle);

        Collections.sort(books, comparator);

        System.out.println("\n" + books.size() + " books in total.\n");
        System.out.println("Books:");

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
