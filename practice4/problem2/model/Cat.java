package problem2.model;

public class Cat implements CanHavePizza {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eatPizza() {
        System.out.println(name + " is eating pizza (meow).");
    }
}
