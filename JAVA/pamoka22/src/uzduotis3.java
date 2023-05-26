import java.util.Arrays;

public class uzduotis3 {
    public static void main(String[] args) {
        double a1 = 17.35;
        double b1 = 18;
        double c1 = 20.47;
        double d1 = 16.37;
        System.out.println("namoPerimetras = " + namoPerimetras(a1, b1, c1, d1));
        double a2 = 2;
        double b2 = 4;
        double c2 = 2;
        double d2 = 4.1;
        System.out.println("namoPerimetras = " + namoPerimetras(a2, b2, c2, d2));
    }


    public static double namoPerimetras(double a, double b, double c, double d) {
        return a + b + c + d;
    }
}


