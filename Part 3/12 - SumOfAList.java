import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            
            list.add(number);
        }
        
        int sum = 0;
        
        for (Integer numbers: list) {
            sum += numbers;
        }
        
        System.out.println("Sum: " + sum);
    }
}