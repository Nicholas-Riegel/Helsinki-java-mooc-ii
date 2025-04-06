public class CD implements Packable {

    private String artist;
    private String title;
    private int year;

    // CD has a constructor which is given the artist (String), name of the CD (String), and the publication year (int). The weight of all CDs is 0.1 kg.
    public CD(String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    public double weight(){
        return 0.1;
    }

    @Override
    public String toString(){
        return artist + ": " + title + " (" + year + ")";
    }
}
