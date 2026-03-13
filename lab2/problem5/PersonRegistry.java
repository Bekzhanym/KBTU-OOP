import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class PersonRegistry {

    private Vector<Person> people;

    public PersonRegistry() {
        people = new Vector<>();
    }

    public void addPerson(Person p) {
        if (p != null && !people.contains(p)) {
            people.add(p);
        }
    }

    public void removePerson(Person p) {
        people.remove(p);
    }

    public List<Person> findWithPets() {
        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (p.hasPet()) result.add(p);
        }
        return result;
    }

    public List<Person> findWithoutPets() {
        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (!p.hasPet()) result.add(p);
        }
        return result;
    }

    public Vector<Person> getPeople() {
        return people;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PersonRegistry:\n");
        for (Person p : people) {
            sb.append("  ").append(p).append("\n");
        }
        return sb.toString();
    }
}
