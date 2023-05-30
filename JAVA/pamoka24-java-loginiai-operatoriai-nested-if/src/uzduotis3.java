public class uzduotis3 {
    public static void main(String[] args) {
        System.out.println("arSusidaroTrikampis(25, 14, 10) = " + arSusidaroTrikampis(25, 14, 10));
        System.out.println("arSusidaroTrikampis(1, 1, 1) = " + arSusidaroTrikampis(1, 1, 1));
        System.out.println("arSusidaroTrikampis(12, 5, 7) = " + arSusidaroTrikampis(12, 5, 7));
        System.out.println("arSusidaroTrikampis(123.451, 146.541, 100.2257) = " + arSusidaroTrikampis(123.451, 146.541, 146.541));
    }

    public static boolean arSusidaroTrikampis(double a, double b, double c) {
        return a < b + c && b < a + c && c < b + a;
    }
}
