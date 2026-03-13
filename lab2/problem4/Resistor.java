/**
 * Single resistor with given resistance (Ohms) and potential difference.
 */
public class Resistor extends Circuit {

    private double resistance;
    private double potentialDifference;

    public Resistor(double resistance) {
        this.resistance = resistance;
        this.potentialDifference = 0.0;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    public double getPotentialDifference() {
        return potentialDifference;
    }

    public void setPotentialDifference(double potentialDifference) {
        this.potentialDifference = potentialDifference;
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
    }
}
