/**
 * PhD Student: cannot have or receive Dogs (too busy for high-maintenance pets).
 * Can have Cat, Fish, Bird.
 */
public class PhDStudent extends Person {

    private String field;

    public PhDStudent(String name, int age, String field, String thesisTopic) {
        super(name, age);
        this.field = field;
    }

    public PhDStudent(String name, int age, String field) {
        this(name, age, field, "");
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) return;
        super.assignPet(pet);
    }

    @Override
    public String getOccupation() {
        return "PhD Student: " + field;
    }

    public String getField() {
        return field;
    }
}
