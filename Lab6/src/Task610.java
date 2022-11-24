import static java.lang.System.out;

import static java.lang.Math.*;

public class Task610 {
    public static void main(String[] args) {
        Square();
    }
    public static double Square() {
        int x = 1;
        double a = 1;
        int b = 2;
        int n = 10;
        while (n <= 10000) {
            double h = (b - a) / n;
            double S = 0;
            for (int i = 1; i <= n; i++) {
                    S += Function(x+i*h) * h;
            }
            out.println("n равно " + n + ", h равно " + h + ", площадь равна " + S +
                    ", результат аналитического решения: " + Integrate() +
                    ", погрешность: " + Error(S) + " %");
            n *= 10;
        }
        return 0;
    }
    public static double Integrate() {
        return 8.233732286597172;
    }
    public static double Error(double S) {
        return (abs(S - Integrate() )/ S * 100);
    }
    public static double Function(double x) {
        return cos(cos(pow(x, 3) + 5)) + 5 * x;
    }
}

