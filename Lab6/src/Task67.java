import static java.lang.System.out;

public class Task67 {
    public static void main(String[] args) {
        Multiplie();
    }
    public static int Multiplie() {
        int i, j;
            for (i = 1; i <= 9; i++) {
                for (j = 1; j <= 9; j++) {
                    out.print(i + " x " + j + " = " + (i * j) + "\t");
                }
                out.println("");
            }
        return 0;
    }
}
