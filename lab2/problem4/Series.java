/**
 * Two circuits connected in series. Equivalent resistance R = R1 + R2.
 * Potential difference is distributed: I = V/R total, then V1 = I*R1, V2 = I*R2.
 */
public class Series extends Circuit {

    private Circuit first;
    private Circuit second;
    private double appliedVoltage;

    public Series(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
        this.appliedVoltage = 0.0;
    }

    @Override
    public double getResistance() {
        return first.getResistance() + second.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return appliedVoltage;
    }

    @Override
    public void applyPotentialDiff(double V) {
        appliedVoltage = V;
        double R = getResistance();
        if (R > 0) {
            double I = V / R;
            first.applyPotentialDiff(I * first.getResistance());
            second.applyPotentialDiff(I * second.getResistance());
        }
    }
}
