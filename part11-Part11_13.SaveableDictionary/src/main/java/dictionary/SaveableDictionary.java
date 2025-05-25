package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;
    
    public SaveableDictionary(){
        dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file){
        this();
        this.file = file;
    }

    public boolean load(){

        // try (Scanner scanner = new Scanner(new File("part11-Part11_13.SaveableDictionary/" + file))){
        try (Scanner scanner = new Scanner(new File(file))){

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                add(parts[0], parts[1]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public boolean save(){

        Map<String, String> newDict = new HashMap<>();
        
        for (String key : dictionary.keySet()){
            if (!newDict.keySet().contains(dictionary.get(key))){
                newDict.put(key, dictionary.get(key));
            }
        }

        // try (PrintWriter writer = new PrintWriter("part11-Part11_13.SaveableDictionary/" + file)) {
        try (PrintWriter writer = new PrintWriter(file)) {
        
            for (String key : newDict.keySet()){
                writer.println(key + ":" + newDict.get(key));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    // adds a word to the dictionary. Every word has just one translation, and if the same word is added for the second time, nothing happens.
    public void add(String words, String translation){
        dictionary.putIfAbsent(words, translation);
        dictionary.putIfAbsent(translation, words);
    } 

    // returns the translation for the given word. If the word is not in the dictionary, returns null.
    public String translate(String word){
        return dictionary.get(word);
    } 

    public void delete(String word){
        dictionary.remove(dictionary.get(word));
        dictionary.remove(word);
    }
}
