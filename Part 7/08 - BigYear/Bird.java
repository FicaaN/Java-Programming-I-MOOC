public class Bird {

    private String name;
    private String latinName;
    private int observation;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLatinName() {
        return latinName;
    }
    
    public int getObservation() {
        return observation;
    }
    
    public void addObservation() {
        this.observation++;
    }
    
    @Override
    public String toString() {
        return name + " (" + latinName + "): " + observation + " observations";
    }
}