public class LiteracyRecord implements Comparable<LiteracyRecord>{

    private String country;
    private int year;
    private String gender;
    private double literacyRate;

    public LiteracyRecord(String country, int year, String gender, Double literacyRate){
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyRate = literacyRate;
    }

    @Override
    public int compareTo(LiteracyRecord record) {
        return Double.compare(this.literacyRate, record.literacyRate);
    }

    @Override
    public String toString(){
        return country + " (" + year + "), " + gender + ", " + literacyRate;
    }
}
