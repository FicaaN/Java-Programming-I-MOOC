import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();
        
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try (Scanner fileName = new Scanner(Paths.get(file))) {
            while(fileName.hasNextLine()) {
                int number = Integer.valueOf(fileName.nextLine());
                
                if (number >= lowerBound && number <= upperBound) {
                    counter++;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        System.out.println("Numbers: " + counter);
    }
}