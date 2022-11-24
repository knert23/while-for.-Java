import java.util.Scanner;

import static java.lang.System.out;


public class Task61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Введите количество членов ряда n:");
        int n = scanner.nextInt();
        out.println("Введите число m:");
        double m = scanner.nextDouble();
        out.println("Введите константу x:");
        double x = scanner.nextDouble();
        double Sn = 0;
        double Sm = 0;
        for (int i = 0; i <= n; i++) {
            Sn += Math.pow(x, i) / Fact(i);
            if ((Math.pow(x, i) / Fact(i)) < m) {
                Sm += Math.pow(x, i) / Fact(i);
            }
        }
        out.println("Сумма первых членов ряда n: " + Sn);
        out.println("Сумма членов ряда, котрые меньше заданного с клавиатуры числа m: " + Sm);
    }
    public static int Fact(int n){
        int result = 1;
        if (n == 0) {
            return result;
        }
        else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
            }
    }
}