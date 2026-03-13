/**
 * Two circuits connected in parallel. 1/R = 1/R1 + 1/R2.
 * Potential difference across each branch equals the applied voltage.
 */
public class Parallel extends Circuit {

    private Circuit first;
    private Circuit second;
    private double appliedVoltage;

    public Parallel(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
        this.appliedVoltage = 0.0;
    }

    @Override
    public double getResistance() {
        double R1 = first.getResistance();
        double R2 = second.getResistance();
        if (R1 <= 0 || R2 <= 0) return 0;
        return (R1 * R2) / (R1 + R2);
    }

    @Override
    public double getPotentialDiff() {
        return appliedVoltage;
    }

    @Override
    public void applyPotentialDiff(double V) {
        appliedVoltage = V;
        first.applyPotentialDiff(V);
        second.applyPotentialDiff(V);
    }
}
