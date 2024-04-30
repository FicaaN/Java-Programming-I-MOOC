import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String name = "";

        while(true) {
            String nameAge = scanner.nextLine();
            
            if (nameAge.equals("")) {
                break;
            }
            
            String[] pieces = nameAge.split(",");
            int age = Integer.valueOf(pieces[1]);
            
            if (age > oldest) {
                oldest = age;
                name = pieces[0];
            }
        }
        
        System.out.println("Name of the oldest: " + name);
    }
}