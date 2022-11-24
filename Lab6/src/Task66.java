import static java.lang.Math.*;

import static java.lang.System.out;

import java.util.Scanner;

public class Task66 {
    public boolean Oblast(double x, double y) {
        int Count1 = 0;
        double Sqrt1 = sqrt(1 - pow((x - 2), 2));
        double Sqrt2 = sqrt(1 - pow((x + 2), 2));
        //Правая часть
        if ((x >= 0) & (x <= 6) & (y >= -3.0 / 2 * x + 4) & (y >= y / 3 + 1.0 / 3) &
                (y >= -2.0 / 7 * x + 10.0 / 7) &
                (y >= 0) & (y <= sqrt(36 - x * x)) & ((y >= Sqrt1 + 4) | (y <= -Sqrt1 + 4))) {
            Count1++;
        }
        //Левая часть
        if ((x >= -5) & (x <= 0) & (y <= 4) & (y <= 4.0 / 3 * x + 20.0 / 3) &
                (y >= 0) & (y >= x / 2 +1) & ((y >= Sqrt2 + 2) | y <= -Sqrt2 + 2)) {
            Count1++;
        }
        return (Count1 > 0);
    }
}
class HitChecker {
    public static void main(String[] args) {
        Scan();
    }
    public static double Scan() {
        try {
            Scanner scanner = new Scanner(System.in);
            out.println("Введите значение координаты x:");
            double x = scanner.nextDouble();
            out.println("Введите значение координаты y:");
            double y = scanner.nextDouble();
            Task66 hitChecker = new Task66();
            out.println(hitChecker.Oblast(x, y));
            Cycle();
        }
        catch (Exception e) {
            out.println("Ошибка");
            return Scan();
        }
        return 0;
    }
    public static double Cycle() {
        Scanner scanner = new Scanner(System.in);
        out.println("Вы хотите проверить еще одну точку?" +
                "\nЕсли да, то введите 1, если нет - любой другой символ");
        try {
            int j = scanner.nextInt();
            if (j == 1) {
                Scan();
            }
        }
        catch (Exception e) {
            out.println("Ну ладно(");
        }
        return 0;
    }

}

