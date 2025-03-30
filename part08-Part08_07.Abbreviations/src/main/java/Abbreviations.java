import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbreviationHashMap;

    public Abbreviations(){
        abbreviationHashMap = new HashMap<>();
    }

    public static String cleanString(String input){
        if (input == null){
            return "";
        }
        return input.trim().toLowerCase();
    }

    // adds a new abbreviation and its explanation.
    public void addAbbreviation(String abbreviation, String explanation) {

        abbreviation = cleanString(abbreviation);
        
        if (this.hasAbbreviation(abbreviation)){
            System.out.println("Abbreviation already exists.");
        } else {
            abbreviationHashMap.put(abbreviation, explanation);
        }
    }
    
    // checks if an abbreviation has already been added; returns true if it has and false if it has not.
    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = cleanString(abbreviation);
        if (abbreviationHashMap.containsKey(abbreviation)){
            return true;
        }
        return false; 
    }
    
    // finds the explanation for an abbreviation; returns null if the abbreviation has not been added yet.
    public String findExplanationFor(String abbreviation) {
        abbreviation = cleanString(abbreviation);
        return this.abbreviationHashMap.get(abbreviation);
    }
}
