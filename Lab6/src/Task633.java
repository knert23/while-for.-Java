import static java.lang.System.out;

public class Task633 {
    public static void main(String[] args) {
        out.println("Сумма произведений : " + summMultiMultiplie());
    }
    public static int summMultiMultiplie() {
        int summ = 0;
        int multik = 1, multij = 1;
        for (int i = 1; i <= 8; i++) {
            for (int j = i; j <= 8; j++) {
                for (int k = 1; k <= 2 * i; k++) {
                    multik *= 2 * i * j - k;
                }
                multij *= multik;
                multik =1;
            }
            summ += multij;
            multij = 1;
        }
        return summ;
    }
}

