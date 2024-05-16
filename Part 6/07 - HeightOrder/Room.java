import java.util.ArrayList;

public class Room {
        
    public ArrayList<Person> room;
    
    public Room() {
        this.room = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.room.add(person);
    }
    
    public boolean isEmpty() {
        if (this.room.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons() {
        return this.room;
    }
    
    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = room.get(0);
        
        for (Person person: room) {
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }
        
        return shortestPerson;
    }
    
    public Person take() {
        if (this.room.isEmpty()) {
            return null;
        }
        
        Person shortestPerson = shortest();
        
        this.room.remove(shortestPerson);
        
        return shortestPerson;
    }
}