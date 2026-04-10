import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee implements Cloneable {

    private Vector<Employee> team;
    private double bonus;

    public Manager(
            String name,
            double salary,
            Date hireDate,
            String insuranceNumber,
            Vector<Employee> team,
            double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.team = team != null ? new Vector<>(team) : new Vector<>();
        this.bonus = bonus;
    }

    public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
        this(name, salary, hireDate, insuranceNumber, new Vector<>(), bonus);
    }

    public Vector<Employee> getTeam() {
        return new Vector<>(team);
    }

    public void setTeam(Vector<Employee> team) {
        this.team = team != null ? new Vector<>(team) : new Vector<>();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void addTeamMember(Employee e) {
        if (e != null) {
            team.add(e);
        }
    }

    @Override
    public int compareTo(Employee o) {
        int bySalary = Double.compare(getSalary(), o.getSalary());
        if (bySalary != 0) {
            return bySalary;
        }
        double otherBonus = o instanceof Manager ? ((Manager) o).getBonus() : 0.0;
        return Double.compare(this.bonus, otherBonus);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Manager manager = (Manager) o;
        return Double.compare(bonus, manager.bonus) == 0 && team.equals(manager.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus, team);
    }

    @Override
    public String toString() {
        return "Manager{name='" + getName() + "', salary=" + getSalary()
                + ", hireDate=" + getHireDate() + ", insuranceNumber='" + getInsuranceNumber()
                + "', bonus=" + bonus + ", teamSize=" + team.size() + "}";
    }

    @Override
    public Manager clone() {
        Manager copy = (Manager) super.clone();
        copy.team = new Vector<>(this.team);
        return copy;
    }
}
