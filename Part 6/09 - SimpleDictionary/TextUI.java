import java.util.Scanner;

public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        
        while(true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            if (input.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                
                dictionary.add(word, translation);
                continue;
            } else if (input.equals("search")) {
                System.out.println("To be translated: ");
                String translate = scanner.nextLine();
                String translatedWord = this.dictionary.translate(translate);
                
                if (translatedWord == null) {
                    System.out.println("Word " + translate + " was not found");
                } else {
                    System.out.println(translatedWord);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
        
        System.out.println("Bye bye!");
    }
}