import java.util.Objects;

public class Chocolate implements Comparable<Chocolate> {

    private final double weight;
    private final String name;

    public Chocolate(String name, double weight) {
        this.name = Objects.requireNonNull(name);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Chocolate o) {
        return Double.compare(this.weight, o.weight);
    }

    @Override
    public String toString() {
        return name + " (" + weight + "g)";
    }
}
