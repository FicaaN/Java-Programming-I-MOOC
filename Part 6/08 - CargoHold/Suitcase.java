import java.util.ArrayList;

public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        int totalWeight = this.totalWeight();
        
        if (totalWeight + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }
    
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        else if (this.items.size() == 1) {
            return "1 item (" + this.items.get(0).getWeight() + "kg)";
        }

        else if (this.items.size() > 1) {
            int totalWeight = this.totalWeight();

            return this.items.size() + " items (" + totalWeight + "kg)";
        } else {
            return null;
        }
    }
    
    public void printItems() {
        String returnString = "";
        for (Item item : this.items) {
            returnString = item.getName() + " (" + item.getWeight() + " kg)";
            System.out.println(returnString);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviestOne = this.items.get(0);
        
        for (Item item: items) {
            if (item.getWeight() > heaviestOne.getWeight()) {
                heaviestOne = item;
            }
        }
        
        return heaviestOne;
    }
}