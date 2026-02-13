import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int D = b * b - 4 * a * c;

        if (D < 0) {
            System.out.println("no roots");
        } else if (D == 0) {
            double x = -b / (2.0 * a);
            System.out.println("One root: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(D)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(D)) / (2.0 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        scanner.close();
    }
}
