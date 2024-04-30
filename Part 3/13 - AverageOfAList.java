import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int counter = 0, sum = 0;
        
        while(true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            
            list.add(number);
            counter += 1;
        }
        
        for (Integer numbers: list) {
            sum += numbers;
        }
        
        System.out.println("Average: " + ((1.0 * sum) / counter));
    }
}