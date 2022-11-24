import java.util.Scanner;

import static java.lang.System.out;

public class Task6331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Введите значение переменной n >= 8:");
        int n = scanner.nextInt();
        if (n < 8) {
            out.println("Выражение не может быть вычислено" +
                    "\nПожалуйста введите значение переменной n >= 8");
        }
        else {
            int summ = 0;
            int multi = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    for (int k = 1; k <= 2 * i; k++) {
                        multi *= 2 * i * j - k;
                    summ += multi;
                    multi = 1;
                    }
                }
            }
            out.println("Сумма произведений произведений равна: " + summ);
        }
    }
}

