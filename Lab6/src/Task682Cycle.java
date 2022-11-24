import java.util.Scanner;

import static java.lang.System.out;

public class Task682Cycle extends FunctionMy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, h;
        out.println("Введите начальное значение переменной x");
        x = in.nextDouble();
        out.println("Введите шаг для переменной h");
        h = in.nextDouble();
        double SummG = 0, SummU = 0;
        for(int i = 0; i < 10; i++) {
            if (FunctionG(x + i * h) == FunctionG(x + i * h))
                SummG += FunctionG(x + i * h);
            if (FunctionU(x + i * h) == FunctionU(x + i * h))
                SummU += FunctionU(x + i * h);
        }
        out.println("SummG = " + SummG);
        out.println("SummU = " + SummU);
    }
}
