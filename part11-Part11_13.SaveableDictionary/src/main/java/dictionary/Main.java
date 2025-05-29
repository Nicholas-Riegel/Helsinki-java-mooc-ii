package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        // SaveableDictionary dictionary = new SaveableDictionary();
        // dictionary.add("apina", "monkey");
        // dictionary.add("banaani", "banana");
        // dictionary.add("apina", "apfe");

        // System.out.println(dictionary.translate("apina"));
        // System.out.println(dictionary.translate("monkey"));
        // System.out.println(dictionary.translate("ohjelmointi"));
        // System.out.println(dictionary.translate("banana"));

        // SaveableDictionary dictionary = new SaveableDictionary();
        // dictionary.add("apina", "monkey");
        // dictionary.add("banaani", "banana");
        // dictionary.add("ohjelmointi", "programming");
        // dictionary.delete("apina");
        // dictionary.delete("banana");

        // System.out.println(dictionary.translate("apina"));
        // System.out.println(dictionary.translate("monkey"));
        // System.out.println(dictionary.translate("banana"));
        // System.out.println(dictionary.translate("banaani"));
        // System.out.println(dictionary.translate("ohjelmointi"));

        // SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        // boolean wasSuccessful = dictionary.load();
        
        // if (wasSuccessful) {
        //     System.out.println("Successfully loaded the dictionary from file");
        // }
        
        // System.out.println(dictionary.translate("apina"));
        // System.out.println(dictionary.translate("ohjelmointi"));
        // System.out.println(dictionary.translate("alla oleva"));
        
        try {

            SaveableDictionary dict = new SaveableDictionary("words.txt");
            
            dict.load();
            dict.getDict().clear();
            
            dict.add("hello", "world");
            dict.add("get", "stuffed");
            dict.add("yo", "mama");
            
            dict.save();
            dict.load();
            dict.getDict().entrySet().stream().forEach(entry -> {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            });
            
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
