import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int weight = this.getSuitcasesWeight();
        
        if (weight + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        int weight = this.getSuitcasesWeight();
        return this.suitcases.size() + " suitcases (" + weight + " kg)";
    }
    
    public int getSuitcasesWeight() {
        int weight = 0;
        
        for (Suitcase suitcase: this.suitcases) {
            weight += suitcase.totalWeight();
        }
        
        return weight;
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printItems();
        }
    }
}