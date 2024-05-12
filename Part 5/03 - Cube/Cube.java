public class Cube {
    public int edgeLength;
    
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    public int volume() {
        return this.edgeLength * this.edgeLength * this.edgeLength;
    }
    
    public String toString() {
        return "The length of the edge is " + edgeLength + " and the volume " + volume();
    }
}