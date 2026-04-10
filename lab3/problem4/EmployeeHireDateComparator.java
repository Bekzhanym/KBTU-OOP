import java.util.Comparator;
import java.util.Date;

public class EmployeeHireDateComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee a, Employee b) {
        Date da = a.getHireDate();
        Date db = b.getHireDate();
        if (da == null && db == null) {
            return 0;
        }
        if (da == null) {
            return -1;
        }
        if (db == null) {
            return 1;
        }
        return da.compareTo(db);
    }
}
