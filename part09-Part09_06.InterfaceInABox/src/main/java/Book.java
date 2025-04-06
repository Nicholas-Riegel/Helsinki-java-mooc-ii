public class Book implements Packable {

    private String author;
    private String title;
    private double weight;
    
    // Book has a constructor which is given the author (String), name of the book (String), and the weight of the book (double) as parameters
    public Book(String author, String title, double weight){
        this.author = author;
        this.title = title;
        this.weight =  weight;
    }

    public double weight(){
        return weight;
    }

    @Override
    public String toString(){
        return author + ": " + title;
    }
}
