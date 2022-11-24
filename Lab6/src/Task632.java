import static java.lang.System.out;

public class Task632 {
    public static void main(String[] args) {
        out.println("Произведение произведений равно: " + multiplie());
    }
    public static int multiplie() {
        int multi = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                multi *= j;
            }
        }
        return multi;
    }
}
