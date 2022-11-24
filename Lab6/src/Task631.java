import static java.lang.System.out;

import static java.lang.Math.*;

public class Task631 {
    public static void main(String[] args) {
        out.println("Сумма сумм равна: " + summSumm());
    }
    public static int summSumm() {
        int summ = 0;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++){
                summ += pow((j + i), 2);
            }
        }
        return summ;
    }

}

