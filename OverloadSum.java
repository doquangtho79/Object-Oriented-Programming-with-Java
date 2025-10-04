package dahinh;
class MathUtil {
    // Cộng 2 số nguyên
    public int sum(int a, int b) {
        return a + b;
    }
    // Cộng 2 số thực
    public double sum(double a, double b) {
        return a + b;
    }
    // Cộng nhiều số nguyên (varargs)
    public int sum(int... values) {
        int s = 0;
        for (int v : values) {
            s += v;
        }
        return s;
    }
}
public class OverloadSum {
    public static void main(String[] args) {
        MathUtil m = new MathUtil();
        System.out.println("sum(int, int): " + m.sum(3, 4));
        System.out.println("sum(double, double): " + m.sum(2.5, 3.5));
        System.out.println("sum(int...): " + m.sum(1, 2, 3, 4, 5));
    }
}
