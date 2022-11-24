import static java.lang.System.out;

import static java.lang.Math.*;

import java.util.Scanner;

public class Task69 {
    public static void main(String[] args) {
        ScanP();
    }
    public static double ScanP() {
        try {
            Scanner scannerP = new Scanner(System.in);
            out.println("Введите корень p больше нуля:");
            double p = scannerP.nextDouble();
            if (p <= 0) {
                out.println("Ошибка!");
                ScanP();
            }
            else {
                ScanX(p);
            }
        }
        catch (Exception e) {
            out.println("Ошибка!");
            ScanP();
        }
        return 0;
    }
    public static double ScanX(double p) {
        try {
            Scanner scannerX = new Scanner(System.in);
            out.println("Введите константу x больше нуля:");
            double x = scannerX.nextDouble();
            if (x <= 0) {
                out.println("Ошибка!");
                 ScanX(p);
            }
            else {
                ScanY0(p, x);
            }
        }
        catch (Exception e) {
            out.println("Ошибка!");
            ScanX(p);
        }
        return 0;
    }
    public static double ScanY0(double p, double x) {
        try {
            Scanner scannerY0 = new Scanner(System.in);
            double limitation = pow(E, ((log(x * (p + 1))) / p));
            out.println("Введите переменную y0 меньше " + limitation);
            double y0 = scannerY0.nextDouble();
            if (y0 >= limitation) {
                out.println("Ошибка!");
                ScanY0(p, x);
            } else {
                Cycle(p, x, y0);
            }
        }
        catch (Exception e) {
            out.println("Ошибка!");
            ScanY0(p, x);
        }
        return 0;
    }
    public static double Cycle(double p, double x, double y0) {
        try {
            double Eps = pow(10, -2);
            int n = 1;
            while (Eps >= pow(10, -6)) {
                double y = (1.0 / p) * (((p - 1) * y0) + (x / pow(y0, (p - 1))));
                while (abs(y - y0) > Eps) {
                    y0 = y;
                    y = (1.0 / p) * (((p - 1) * y0) + (x / pow(y0, (p - 1))));
                    n += 1;
                }
                out.println("При точности " + Eps + " корень p-ой степени равен " + y +
                        ", число итераций равно " + n);
                Eps *= 0.1;
            }
        }
        catch (Exception e) {
            out.println("Ошибка!");
            Cycle(p, x, y0);
        }
        return 0;
    }
}