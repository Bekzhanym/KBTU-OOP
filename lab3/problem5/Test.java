import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT);

        System.out.print("Сколько шоколадок? ");
        int nCh = Integer.parseInt(sc.nextLine().trim());
        Chocolate[] chocolates = new Chocolate[nCh];
        for (int i = 0; i < nCh; i++) {
            System.out.print("название и вес (вес — последнее число в строке): ");
            String line = sc.nextLine().trim();
            int last = line.lastIndexOf(' ');
            String name = line.substring(0, last).trim();
            double w = Double.parseDouble(line.substring(last + 1).replace(',', '.'));
            chocolates[i] = new Chocolate(name, w);
        }

        System.out.print("Сколько времён? ");
        int nT = Integer.parseInt(sc.nextLine().trim());
        Time[] times = new Time[nT];
        for (int i = 0; i < nT; i++) {
            System.out.print("час мин сек через пробел: ");
            String[] p = sc.nextLine().trim().split("\\s+");
            times[i] = new Time(
                    Integer.parseInt(p[0]),
                    Integer.parseInt(p[1]),
                    Integer.parseInt(p[2]));
        }

        System.out.print("Сколько Employee? ");
        int nE = Integer.parseInt(sc.nextLine().trim());
        Employee[] employees = new Employee[nE];
        for (int i = 0; i < nE; i++) {
            System.out.print("имя: ");
            String name = sc.nextLine().trim();
            System.out.print("зарплата: ");
            double sal = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
            System.out.print("дата найма yyyy-MM-dd: ");
            Date d = df.parse(sc.nextLine().trim());
            System.out.print("страховой номер: ");
            String ni = sc.nextLine().trim();
            employees[i] = new Employee(name, sal, d, ni);
        }

        System.out.println("\n--- Chocolate: bubbleSort ---");
        Chocolate[] c1 = Arrays.copyOf(chocolates, chocolates.length);
        Sort.bubbleSort(c1);
        System.out.println(Arrays.toString(c1));

        System.out.println("--- Chocolate: mergeSort ---");
        Chocolate[] c2 = Arrays.copyOf(chocolates, chocolates.length);
        Sort.mergeSort(c2);
        System.out.println(Arrays.toString(c2));

        System.out.println("\n--- Time: bubbleSort ---");
        Time[] t1 = Arrays.copyOf(times, times.length);
        Sort.bubbleSort(t1);
        System.out.println(Arrays.toString(t1));

        System.out.println("--- Time: mergeSort ---");
        Time[] t2 = Arrays.copyOf(times, times.length);
        Sort.mergeSort(t2);
        System.out.println(Arrays.toString(t2));

        System.out.println("\n--- Employee: bubbleSort ---");
        Employee[] e1 = Arrays.copyOf(employees, employees.length);
        Sort.bubbleSort(e1);
        System.out.println(Arrays.toString(e1));

        System.out.println("--- Employee: mergeSort ---");
        Employee[] e2 = Arrays.copyOf(employees, employees.length);
        Sort.mergeSort(e2);
        System.out.println(Arrays.toString(e2));
    }
}
