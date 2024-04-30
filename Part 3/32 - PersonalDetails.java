import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int longestNameCount = 0;
        String longestName = "";
        int sum = 0;
        int counter = 0;
        
        while(true) {
            
            String nameAge = scanner.nextLine();
            
            if (nameAge.equals("")) {
                break;
            }
            
            String[] pieces = nameAge.split(",");
            
            if (pieces[0].length() > longestNameCount) {
                longestNameCount = pieces[0].length();
                longestName = pieces[0];
            }
            
            sum += Integer.valueOf(pieces[1]);
            counter += 1;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / counter));
    }
}