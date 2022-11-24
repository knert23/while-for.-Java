import java.util.Scanner;

import static java.lang.Math.*;

import static java.lang.System.out;

public class Task68 {
    public static double FunctionMy(double x, double y, double z, double k, double y1) {
        out.println("Функция g = " + FunctionG(x, y, z));
        out.println("Функция u = " + FunctionU(k, y1));
        return FunctionG(x, y, z) + FunctionU(k, y1);
    }
    public static double FunctionG(double x, double y, double z) {
        return (tan(pow(x,4) - 6) - pow(cos(z + x * y), 3)) / pow(cos(pow(x,3) + pow(sin(PI + x), 3)), 4 );
    }

    public static double FunctionU(double k, double y1) {
        return (log(k - y1) + pow(y1, 4)) / (pow(E,y1) + 2.355 * k * k);
    }
}
class Summ extends Task68{
    public static void main(String[] args) {
        Scan();
    }
    public static double Scan() {
        try {
            Scanner in = new Scanner(System.in);
            double x, y, z, k, y1;
            out.println("Введите переменную x");
            x = in.nextDouble();
            out.println("Введите переменную y");
            y = in.nextDouble();
            out.println("Введите переменную z");
            z = in.nextDouble();
            out.println("Введите переменную k");
            k = in.nextDouble();
            out.println("Введите переменную y1");
            y1 = in.nextDouble();
            Cycle(x, y, z, k, y1);
        }
        catch (Exception e) {
            out.println("Ошибка!");
            return Scan();
        }
        return 0;
    }
    public static double Cycle(double x, double y, double z, double k, double y1) {
        double summ = 0;
        for (int i = 1; i <= 10; i++) {
            summ = summ + FunctionMy(x, y, z, k, y1);
            out.println("Сумма функций равна: " + summ);
            try {
                Scanner scannerG = new Scanner(System.in);
                out.println("Какой параметр(x, y, z) вы хотите изменить у функции g?");
                String sG = scannerG.nextLine();
                switch (sG) {
                    case "x" -> {
                        out.println("Введите новое значение x:");
                        x = scannerG.nextDouble();
                    }
                    case "y" -> {
                        out.println("Введите новое значение y:");
                        y = scannerG.nextDouble();
                    }
                    case "z" -> {
                        out.println("Введите новое значение z:");
                        z = scannerG.nextDouble();
                    }
                }
            }
            catch (Exception e) {
                out.println("Ошибка!");
            }
            try {
                out.println("Какой параметр (k, y1) вы хотите изменить у функции u?");
                Scanner scannerU = new Scanner(System.in);
                String sU = scannerU.nextLine();
                switch (sU) {
                    case "k" -> {
                        out.println("Введите новое значение k:");
                        k = scannerU.nextDouble();
                    }
                    case "y1" -> {
                        out.println("Введите новое значение y1:");
                        y1 = scannerU.nextDouble();
                    }
                }
            }
            catch (Exception e) {
                out.println("Ошибка");
            }
        }
        return 0;
    }
}