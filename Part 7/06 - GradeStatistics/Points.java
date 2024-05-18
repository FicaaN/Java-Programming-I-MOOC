import java.util.ArrayList;

public class Points {

    ArrayList<Integer> points;
    ArrayList<Integer> passingPoints;
    
    public Points() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
    }
    
    public void add(int number) {
        if (number >= 0 && number <= 100) {
            this.points.add(number);
        }
        
        if (number >= 50 && number <= 100) {
            this.passingPoints.add(number);
        }
    }
    
    public double average() {
        int sum = 0;
        
        for (int point: points) {
            sum += point;
        }
        
        return 1.0 * sum / this.points.size();
    }
    
    public double averagePassing() {
        int sum = 0;
        
        for (int point: passingPoints) {
            sum += point;
        }
        
        return 1.0 * sum / this.passingPoints.size();
    }
    
    public double passingPercentage() {
        int passing = this.passingPoints.size();
        int participants = this.points.size();
        
        if (participants == 0) {
            return 0.0;
        } else {
            return 100.0 * passing / participants;
        }
    }
    
    public void gradeDistribution() {
        int[] grades = new int[6];
        
        for (int point : this.points) {
            if (point < 50) {
                grades[0]++;
            } else if (point < 60) {
                grades[1]++;
            } else if (point < 70) {
                grades[2]++;
            } else if (point < 80) {
                grades[3]++;
            } else if (point < 90) {
                grades[4]++;
            } else {
                grades[5]++;
            }
        }
        
        for (int i = 5; i >= 0; i--) {
            if (grades[i] >= 0) {
                System.out.print(i + ": ");
                for (int j = 0; j < grades[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}