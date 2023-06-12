import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class uzduotys {
    public static void main(String[] args) {
        String s1 = "labas123";
        String s2 = "vakaras456";
        System.out.println(kurioTekstoSkaiciaiDidesni(s1, s2));

        Scanner ivedimas = new Scanner(System.in);
        System.out.println("Įveskite piramidės skaičių:");
        int p = ivedimoTikrinimas(ivedimas);
        skaiciuPiramide(p);

        String s3 = "(1.5, 12.3)";
        sveikuSkaiciuIsvedimas(s3);

        System.out.println("įveskite žodį kurį norite patikrinti ar jis yra palindromas:");
        String s4 = ivedimas.next();
        System.out.println("arZodisYraPalindromas(s4) = " + arZodisYraPalindromas(s4));

        System.out.println("įveskite kelintą Fibbonaci sekos narį norite rasti:");
        int x = ivedimoTikrinimas(ivedimas);
        System.out.println("ntasisFibbonaciSkaicius(x) = " + ntasisFibbonaciSkaicius(x));
        System.out.println("ntasisFibonaciRekursija(x) = " + ntasisFibonaciRekursija(x));

        int n = ivedimas.nextInt();
        printPascalTriangle(n);
    }


    public static boolean arSkaiciusSveikasis(double x) {
        return x % 1 == 0;
    }


    public static double intervaloPradziaIsString(String a) {
        String[] intervalai = a.substring(1, a.length() - 1).split(", ");
        if (a.startsWith("[")) {
            return Double.parseDouble(intervalai[0]);
        } else {
            return Double.parseDouble(intervalai[0]) + 1;
        }
    }

    public static double intervaloPabaigaIsString(String a) {
        String[] intervalai = a.substring(1, a.length() - 1).split(", ");
        if (a.endsWith("]")) {
            return Double.parseDouble(intervalai[1]);
        } else {
            return Double.parseDouble(intervalai[1]) + 1;
        }

    }

    public static void sveikuSkaiciuIsvedimas(String s) {
        double x = intervaloPradziaIsString(s);
        double y = intervaloPabaigaIsString(s);

        if (arSkaiciusSveikasis(x)) {
            for (double i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            for (double i = Math.ceil(x); i <= y; i++) {
                System.out.println(i);
            }
        }
    }

    public static String kurioTekstoSkaiciaiDidesni(String s1, String s2) {
        return parseInt(s1.substring(s1.length() - 3)) > parseInt(s2.substring(s2.length() - 3)) ?
                "Pirmo teksto ksaičiai didesni" : "Antro teksto skaičiai didesni";
    }

    public static void skaiciuPiramide(int x) {
        int tarpai = x - 2;
        for (int i = 1; i <= x; i++) {
            for (int k = tarpai; k >= 0; k--) {
                System.out.print(" ");
            }
            tarpai--;
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int ivedimoTikrinimas(Scanner scanner) {
        int number = 0;
        if (!scanner.hasNextInt()) {
            System.out.println("Netinkamas įvedimas, prašome įvesti skaičių:");
            scanner.next();
        } else {
            number = scanner.nextInt();
        }
        return number;

    }

    public static String atvirksciasString(String a) {
        String atvirkscias = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            atvirkscias += a.charAt(i);
        }
        return atvirkscias;
    }

    public static boolean arZodisYraPalindromas(String s) {
        return s.equalsIgnoreCase(atvirksciasString(s));
    }

    public static BigInteger ntasisFibbonaciSkaicius(int n) {
        if (n == 1) {
            return BigInteger.ZERO;
        } else if (n == 2) {
            return BigInteger.ONE;
        } else {
            BigInteger x = BigInteger.ZERO;
            BigInteger y = BigInteger.ONE;
            BigInteger sekantisSkaicius = BigInteger.ZERO;
            for (int i = 3; i <= n; i++) {
                sekantisSkaicius = x.add(y);
                x = y;
                y = sekantisSkaicius;
            }
            return sekantisSkaicius;
        }
    }
    public static BigInteger ntasisFibonaciRekursija(int n){
        if (n == 1) {
            return BigInteger.ZERO;
        } else if (n == 2) {
            return BigInteger.ONE;
        } else return ntasisFibonaciRekursija(n - 1).add(ntasisFibonaciRekursija(n - 2));
    }

    public static void printPascalTriangle(int n) {
        for (int line = 0; line < n; line++) {
            for (int i = 0; i <= line; i++) {
                System.out.print(calculateBinomialCoefficient(line, i) + " ");
            }
            System.out.println();
        }
    }

    public static int calculateBinomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return calculateBinomialCoefficient(n - 1, k - 1) + calculateBinomialCoefficient(n - 1, k);
        }
    }
}
