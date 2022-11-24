import java.util.Scanner;

import static java.lang.System.out;

public class Task6321 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Введите значение переменной n >= 5:");
        int n = scanner.nextInt();
        if (n < 5) {
            out.println("Выражение не может быть вычислено" +
                    "\nПожалуйста введите значение переменной n >= 5");
        }
        else {
            long multi = 1;
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    multi *= j;
                }
            }
            out.println("Произведение произведений равно: " + multi);
        }
    }
}
