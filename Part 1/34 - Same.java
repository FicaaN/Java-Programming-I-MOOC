import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        
        if (word1.equals(word2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}