import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        
        for (Integer number: numbers) {
            sum += number;
        }
        
        return sum;
    }
}