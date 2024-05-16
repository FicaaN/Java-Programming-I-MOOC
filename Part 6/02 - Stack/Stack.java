import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> list;
    
    public Stack() {
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if(list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value) {
        list.add(value);
    }
    
    public ArrayList<String> values() {
        return list;
    }
    
    public String take() {
        return list.remove(list.size() - 1);
    }
}