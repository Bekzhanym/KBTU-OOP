package problem5;

import java.util.Scanner;

public class DragonLaunchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ряд (B и G без пробелов, например BBGG или GBGB): ");
        String line = sc.nextLine().toUpperCase().replaceAll("\\s+", "");

        DragonLaunch dragon = new DragonLaunch();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == 'B') {
                dragon.kidnap(new Person(Gender.B));
            } else if (c == 'G') {
                dragon.kidnap(new Person(Gender.G));
            }
        }

        System.out.println(dragon.willDragonEatOrNot());
        sc.close();
    }
}
