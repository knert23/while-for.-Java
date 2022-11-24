import static java.lang.Math.*;

public class FunctionMy {
    public static double FunctionG(double x) {
        double y = 0.4, z = 9;
        return (tan(pow(x,4) - 6) - pow(cos(z + x * y), 3)) / pow(cos(pow(x,3) + pow(sin(PI + x), 3)), 4 );
    }

    public static double FunctionU(double k) {
        double y1 = 0.4;
        return (log(k - y1) + pow(y1, 4)) / (pow(E,y1) + 2.355 * k * k);
    }
}
