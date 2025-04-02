import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations(){
        translations = new HashMap<>();
    }

    // adds the translation for the word and preserves the old translations.
    public void add(String word, String translation) {
        translations.putIfAbsent(word, new ArrayList<>());
        translations.get(word).add(translation);
    }
    
    // returns a list of the translations added for the word. If the word has no translations, the method should return an empty list.
    public ArrayList<String> translate(String word) {
        if (translations.containsKey(word)){
            return translations.get(word);
        }
        return new ArrayList<>();
    }
    
    // removes the word and all its translations from the dictionary.
    public void remove(String word) {
        translations.remove(word);
    }
}
