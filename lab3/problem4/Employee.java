import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Cloneable, Comparable<Employee> {

    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = copyDate(hireDate);
        this.insuranceNumber = insuranceNumber != null ? insuranceNumber : "";
    }

    public Employee(String name, double salary, Date hireDate) {
        this(name, salary, hireDate, "");
    }

    private static Date copyDate(Date d) {
        return d == null ? null : new Date(d.getTime());
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return copyDate(hireDate);
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = copyDate(hireDate);
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber != null ? insuranceNumber : "";
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
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0
                && Objects.equals(hireDate, employee.hireDate)
                && Objects.equals(insuranceNumber, employee.insuranceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, hireDate, insuranceNumber);
    }

    @Override
    public String toString() {
        return "Employee{name='" + getName() + "', salary=" + salary
                + ", hireDate=" + hireDate + ", insuranceNumber='" + insuranceNumber + "'}";
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

    @Override
    public Employee clone() {
        try {
            Employee copy = (Employee) super.clone();
            copy.hireDate = copyDate(this.hireDate);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
