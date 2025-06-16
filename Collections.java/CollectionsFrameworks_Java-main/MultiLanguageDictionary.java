import java.util.*;

class Dictionary<T extends Comparable<T>> {
    private TreeMap<T, String> dictionary;

    
    public Dictionary() {
        dictionary = new TreeMap<>();
    }

    
    public void addTranslation(T word, String translation) {
        dictionary.put(word, translation);
    }

    
    public String getTranslation(T word) {
        return dictionary.getOrDefault(word, "Translation not found.");
    }

    public void displayAllTranslations() {
        for (Map.Entry<T, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

public class MultiLanguageDictionary {
    public static void main(String[] args) {
        
        Dictionary<String> englishSpanishDict = new Dictionary<>();

        
        englishSpanishDict.addTranslation("Hello", "Hola");
        englishSpanishDict.addTranslation("Goodbye", "Adiós");
        englishSpanishDict.addTranslation("Please", "Por favor");
        englishSpanishDict.addTranslation("Thank you", "Gracias");

        
        System.out.println("English to Spanish Dictionary:");
        englishSpanishDict.displayAllTranslations();

        
        String translation = englishSpanishDict.getTranslation("Hello");
        System.out.println("\nTranslation of 'Hello': " + translation);

        
        Dictionary<String> frenchGermanDict = new Dictionary<>();

        
        frenchGermanDict.addTranslation("Bonjour", "Guten Tag");
        frenchGermanDict.addTranslation("Merci", "Danke");
        frenchGermanDict.addTranslation("S'il vous plaît", "Bitte");
        frenchGermanDict.addTranslation("Au revoir", "Auf Wiedersehen");

        
        System.out.println("\nFrench to German Dictionary:");
        frenchGermanDict.displayAllTranslations();

       
        translation = frenchGermanDict.getTranslation("Merci");
        System.out.println("\nTranslation of 'Merci': " + translation);
    }
}
