import static java.lang.System.out;

import static java.lang.Math.*;

import java.util.Scanner;

public class Task6311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Введите значение переменной n >= 8:");
        int n = scanner.nextInt();
         if (n < 8) {
             out.println("Выражение не может быть вычислено" +
                     "\nПожалуйста введите значение переменной n >= 8");
         }
         else {
             long summ = 0;
             for (int i = 1; i <= n; i++) {
                 for (int j = 1; j <= i; j++) {
                     summ += pow((j + i), 2);
                 }
             }
             out.println("СУмма сумм равна: " + summ);
         }
    }
}
