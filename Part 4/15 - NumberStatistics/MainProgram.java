import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics evemStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();

        System.out.println("Enter numbers:");
        
        while (true) {
            
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            if (number % 2 == 0) {
                evemStatistics.addNumber(number);
            } else {
                oddStatistics.addNumber(number);
            }
            statistics.addNumber(number);
        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evemStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddStatistics.sum());
    }
}