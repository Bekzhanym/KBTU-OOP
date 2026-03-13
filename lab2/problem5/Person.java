import java.util.HashMap;
import java.util.Map;

/**
 * Abstract base class for a person who may own a pet or temporarily care for others' pets.
 */
public abstract class Person {

    private String name;
    private int age;
    private Animal myPet;
    private Map<Person, Animal> petsInCare;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.myPet = null;
        this.petsInCare = new HashMap<>();
    }

    public void assignPet(Animal pet) {
        if (pet == null) return;
        this.myPet = pet;
    }

    public void removePet() {
        this.myPet = null;
    }

    public boolean hasPet() {
        return myPet != null || !petsInCare.isEmpty();
    }

    public Animal getMyPet() {
        return myPet;
    }

    public abstract String getOccupation();

    /**
     * Leave own pet with another person (e.g. for vacation).
     * Fails if no pet, or if caretaker is PhDStudent and pet is a Dog.
     */
    public boolean leavePetWith(Person caretaker) {
        if (myPet == null || caretaker == null || caretaker == this) return false;
        if (caretaker.receivePetForCare(this, myPet)) {
            myPet = null;
            return true;
        }
        return false;
    }

    /**
     * Retrieve own pet from the temporary caretaker.
     */
    public boolean retrievePetFrom(Person caretaker) {
        if (caretaker == null || myPet != null) return false;
        Animal pet = caretaker.giveBackPet(this);
        if (pet != null) {
            myPet = pet;
            return true;
        }
        return false;
    }

    /**
     * Called when someone leaves their pet with this person. Returns false if this person
     * cannot accept the pet (e.g. PhDStudent cannot take a Dog).
     */
    public boolean receivePetForCare(Person owner, Animal pet) {
        if (owner == null || pet == null) return false;
        if (this instanceof PhDStudent && pet instanceof Dog) return false;
        petsInCare.put(owner, pet);
        return true;
    }

    /**
     * Return the pet that was left by the given owner.
     */
    public Animal giveBackPet(Person owner) {
        return petsInCare.remove(owner);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName()).append("[name='").append(name).append("', age=").append(age);
        sb.append(", occupation=").append(getOccupation());
        if (myPet != null) {
            sb.append(", myPet=").append(myPet);
        }
        if (!petsInCare.isEmpty()) {
            sb.append(", petsInCare=").append(petsInCare.values());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && (name != null ? name.equals(person.name) : person.name == null);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
