import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.out;

class Task660 {
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
            Task66 hitCheker = new Task66();
            out.println(hitCheker.Oblast(x, y));
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

