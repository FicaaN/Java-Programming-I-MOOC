import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;
        
        while(true) {
            
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String parts[] = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount < 1) {
                continue;
            }
            
            if(command.equals("add")) {
                if (container1 + amount <= 100) {
                    container1 += amount;
                } else {
                    container1 = 100;
                }
            }
            
            if (command.equals("move")) {
                if (amount > container1) {
                    container2 += container1;
                } else {
                    container2 += amount;
                    container1 -= amount;
                }
            }
            
            if (command.equals("remove")) {
                if (container2 - amount >= 0) {
                    container2 -= amount;
                } else {
                    container2 = 0;
                }
            }
            
            if (container2 > 100) {
                container2 = 100;
            }
        }
    }
}