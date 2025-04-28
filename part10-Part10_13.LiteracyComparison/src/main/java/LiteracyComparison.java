import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LiteracyComparison {
    public static void main(String[] args) {
        
        // List<String> rates = readFile("part10-Part10_13.LiteracyComparison/literacy.csv");
        List<String> rates = readFile("literacy.csv");
        
        // rates
        //     .stream()
        //     .map(line -> line.split(","))
        //     .map(lineArray -> new LiteracyRecord(
        //         lineArray[3].trim(), 
        //         Integer.valueOf(lineArray[4].trim()), 
        //         lineArray[2].trim().split(" ")[0], 
        //         Double.valueOf(lineArray[5].trim())))
        //     .sorted()
        //     .forEach(r -> System.out.println(r));

        rates
            .stream()
            .map(line -> line.split(","))
            .sorted((a, b) -> Double.compare(Double.parseDouble(a[5].trim()), Double.parseDouble(b[5].trim())))
            .forEach(line -> {
                System.out.println(line[3] + " (" + line[4] + "), " + line[2].trim().split(" ")[0] + ", " + line[5]);
            });
    }

    public static List<String> readFile(String file){
        List<String> rates = new ArrayList<>();
        try (Stream<String> lines = Files.lines(Paths.get(file))){
            lines.forEach(rates::add);
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        return rates; 
    }
}
