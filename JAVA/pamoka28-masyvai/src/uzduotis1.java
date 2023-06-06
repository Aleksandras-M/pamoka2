import java.util.Arrays;

public class uzduotis1 {
    public static void main(String[] args) {
        int[] x = {12, 14, 16, 17, 21, 29, 33, 35, 37, 42, 44, 50, 53, 54, 57, 61, 63, 67, 73, 75, 88, 91, 93, 95, 99,
                103, 105, 119, 120, 121, 126, 137, 139, 143, 146, 148, 150, 162, 162, 170, 173, 175, 178, 179, 181,
                186, 187, 189, 190, 195, 196};
        System.out.println("kiekPirminiuSkaiciuMasyve(x) = " + kiekPirminiuSkaiciuMasyve(x));

        int[] y1 = {3, 5, 8};
        int[] y2 = {2, 7, 12, 9};
        System.out.println("Arrays.toString(masyvuSudejimas(y1, y2)) = " + Arrays.toString(masyvuSudejimas(y1, y2)));

        double[] y3 = {32.4, 14.9, 7.6, 43.2, 25.3, 19.8, 38.1, 2.7, 46.5, 9.2};
        System.out.println("masyvoElementuSumaSuFor(y3) = " + masyvoElementuSumaSuFor(y3));
        System.out.println("masyvoElementuSumaSuWhile(y3) = " + masyvoElementuSumaSuWhile(y3));
    }

    public static boolean arPirminisSkaicius(int x) {
        if (x <= 1) {
            return false;
        }

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int kiekPirminiuSkaiciuMasyve(int[] a){
        int kiekis = 0;
        for (int j : a) {
            if (arPirminisSkaicius(j)) {
                kiekis++;
            }
        }return kiekis;
    }

    public static int[] masyvuSudejimas(int[] a, int[] b) {
        int[] rezultatas = new int[a.length + b.length];
        System.arraycopy(a, 0, rezultatas, 0, a.length);
        System.arraycopy(b, 0, rezultatas, a.length, b.length);
        return rezultatas;
    }

    public static double masyvoElementuSumaSuFor(double[] a){
        double suma = 0;
        for(double i : a) {
            suma += i;
        }return suma;
    }

    public static double masyvoElementuSumaSuWhile(double[] a) {
        double suma = 0;
        int index = 0;
        while (index < a.length) {
            suma += a[index];
            index++;
        }
        return suma;
    }
}
