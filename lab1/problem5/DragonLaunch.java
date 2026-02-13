package problem5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> line = new Vector<>();

    public void kidnap(Person p) {
        line.add(p);
    }

    public boolean willDragonEatOrNot() {
        int unmatchedB = 0;
        int left = 0;  

        for (Person p : line) {
            if (p.getGender() == Gender.B) {
                unmatchedB++;
            } else {
                if (unmatchedB > 0) {
                    unmatchedB--;
                } else {
                    left++;
                }
            }
        }
        left += unmatchedB;
        return left > 0;
    }
}
