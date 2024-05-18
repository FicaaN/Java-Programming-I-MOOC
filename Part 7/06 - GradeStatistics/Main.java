import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points points = new Points();
        
        System.out.println("Enter point totals, -1 stops:");
        
        while(true) {
            int point = Integer.valueOf(scanner.nextLine());
            
            if (point == -1) {
                break;
            }
            
            points.add(point);
        }
        
        System.out.println("Point average (all): " + points.average());
        
        double passingPoints = points.averagePassing();
        if (passingPoints == 0.0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingPoints);
        }
        
        System.out.println("Pass percentage: " + points.passingPercentage());
        
        System.out.println("Grade distribution:");
        points.gradeDistribution();
    }
}