// Ohm's law: I = V/R, power = V^2/R.
public abstract class Circuit {

    public abstract double getResistance();

    public abstract double getPotentialDiff();

    public abstract void applyPotentialDiff(double V);

    public double getPower() {
        double V = getPotentialDiff();
        double R = getResistance();
        return R > 0 ? (V * V / R) : 0;
    }

    public double getCurrent() {
        double R = getResistance();
        return R > 0 ? (getPotentialDiff() / R) : 0;
    }
}
