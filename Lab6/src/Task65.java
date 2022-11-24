import static java.lang.System.out;

import static java.lang.Math.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Введите переменную x меньше 1:");
        double x = scanner.nextDouble();
        double Eps = pow(10, -2);
        DecimalFormat decimalFormat = new DecimalFormat("0.000000000000");
        if (x >= 1) {
            out.println("Ошибка" +
                    "\nВведите x меньше 1");
        }
        else {
            while (Eps >= pow(10, -4)) {
                int count = 0;
                double summ = 0;
                int n = 1;
                while ((abs(pow(sin(x), 3) - summ/4)) >= Eps) {
                    summ += pow(-1, (n + 1)) * ((pow(3, (2 * n + 1)) - 3) / Fact(2 * n + 1)) * pow(x, (2 * n + 1));
                    n++;
                    count++;
                }
                out.println("Значение ряда Маклорена при погрешности " + Eps + " равно " +
                        decimalFormat.format((1.0 / 4) * summ) + ", число итераций: " + count);
                Eps *= 0.1;
            }
        }
    }
    public static int Fact(int n) {
        int result = 1;
        for (int j = 1; j <= n; j++) {
            result *= j;
        }
        return result;
    }
}