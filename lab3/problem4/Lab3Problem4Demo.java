import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class Lab3Problem4Demo {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT);

        System.out.println("--- Employee 1 ---");
        System.out.print("имя: ");
        String n1 = sc.nextLine().trim();
        System.out.print("зарплата: ");
        double s1 = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
        System.out.print("дата найма yyyy-MM-dd: ");
        Date d1 = df.parse(sc.nextLine().trim());
        System.out.print("страховой номер: ");
        String i1 = sc.nextLine().trim();
        Employee e1 = new Employee(n1, s1, d1, i1);

        System.out.println("\n--- Employee 2 ---");
        System.out.print("имя: ");
        String n2 = sc.nextLine().trim();
        System.out.print("зарплата: ");
        double s2 = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
        System.out.print("дата найма yyyy-MM-dd: ");
        Date d2 = df.parse(sc.nextLine().trim());
        System.out.print("страховой номер: ");
        String i2 = sc.nextLine().trim();
        Employee e2 = new Employee(n2, s2, d2, i2);

        System.out.println("\n--- Manager (команда = эти два Employee) ---");
        System.out.print("имя: ");
        String nm = sc.nextLine().trim();
        System.out.print("зарплата: ");
        double sm = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
        System.out.print("дата найма yyyy-MM-dd: ");
        Date dm = df.parse(sc.nextLine().trim());
        System.out.print("страховой номер: ");
        String im = sc.nextLine().trim();
        System.out.print("бонус: ");
        double bonus = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
        Vector<Employee> team = new Vector<>();
        team.add(e1);
        team.add(e2);
        Manager m = new Manager(nm, sm, dm, im, team, bonus);

        List<Employee> all = new ArrayList<>();
        all.add(e1);
        all.add(e2);
        all.add(m);

        System.out.println("\n--- toString ---");
        all.forEach(System.out::println);

        System.out.println("\n--- Comparable (зарплата, у Manager при равной — бонус) ---");
        Collections.sort(all);
        all.forEach(System.out::println);

        System.out.println("\n--- по имени ---");
        Collections.sort(all, new EmployeeNameComparator());
        all.forEach(System.out::println);

        System.out.println("\n--- по дате найма ---");
        Collections.sort(all, new EmployeeHireDateComparator());
        all.forEach(System.out::println);

        System.out.println("\n--- equals (1 и 2): " + e1.equals(e2));
        Employee e1copy = e1.clone();
        e1copy.setSalary(-1);
        System.out.println("--- clone: оригинал зарплата " + e1.getSalary() + ", клон " + e1copy.getSalary());
        Manager mc = m.clone();
        mc.addTeamMember(new Employee("X", 1, new Date(), "x"));
        System.out.println("--- clone Manager: размер команды оригинал " + m.getTeam().size() + ", клон " + mc.getTeam().size());
    }
}
