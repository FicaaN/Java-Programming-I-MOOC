import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0, counter = 0, even = 0, odd = 0;
        double average = 0;
        
        System.out.println("Give numbers:");
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + counter);
                System.out.println("Average: " + average);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            } else {
                System.out.println(number);
                sum += number;
                counter += 1;
                average = 1.0 * sum / counter;
                
                if (number % 2 == 0) {
                    even += 1;
                } else {
                    odd += 1;
                }
            }
        }
    }
}