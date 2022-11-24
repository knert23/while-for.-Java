import java.util.Scanner;

import static java.lang.System.out;

public class Task62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Введите начальный номер билета:");
        int n = scanner.nextInt();
        int k = 0;
        for (int i = n; i <= 999999; i++) {
            if ( firstThree(i) ==secondThree(i)) {
                k++;
            }
        }
        out.println("Число счастливых билетов: " + k);
    }

    public static int firstThree(int n){
        int a = n % 1000;
        a = (a % 10) + (a / 100) + ((a / 10) % 10);
        return a;
    }

    public static int secondThree(int n){
        int b = n / 1000;
        b = (b % 10) + (b / 100) + ((b / 10) % 10);
        return b;
    }
}
