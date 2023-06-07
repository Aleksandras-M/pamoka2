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
        System.out.println("masyvuSudejimasBeSukurtuJavaFunkciju(y1, y2) = " +
                Arrays.toString(masyvuSudejimasBeSukurtuJavaFunkciju(y1, y2)));

        double[] y3 = {32.4, 14.9, 7.6, 43.2, 25.3, 19.8, 38.1, 2.7, 46.5, 9.2};
        System.out.println("masyvoElementuSumaSuFor(y3) = " + suapvalinti(masyvoElementuSumaSuFor(y3)));
        System.out.println("masyvoElementuSumaSuWhile(y3) = " + suapvalinti(masyvoElementuSumaSuWhile(y3)));

        int[] masyvasSuNeigimais = {-12, 38, 5, -45, 28, 9, -34, 16, 47, -22, 41, -2, -17, 30, -41, -6, 19, 33, 0, -29};
        System.out.println("neigiamuElementuKeitimasITeigiamusMasyve(masyvasSuNeigimais) = " +
                Arrays.toString(neigiamuElementuKeitimasITeigiamusMasyve(masyvasSuNeigimais)));

        String[] zodziai = {"kelmas", "botAGAS", "laumė", "mašina", "burlaivis"};
        System.out.println("kiekMasyveVyriskosGiminesZodziu(zodziai) = " + kiekMasyveVyriskosGiminesZodziu(zodziai));
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

    public static int[] masyvuSudejimasBeSukurtuJavaFunkciju(int[] a, int[] b){
        int[] rezultatas = new int[a.length + b.length];
        int i = 0;

        for(int ele: a){
            rezultatas[i] = ele;
            i++;
        }

        for(int ele: b){
            rezultatas[i] = ele;
            i++;
        }

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

    public static boolean arSkaiciusNeigiamas(int x){
        return x < 0;
    }

    public static int[] neigiamuElementuKeitimasITeigiamusMasyve(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (arSkaiciusNeigiamas(a[i])) {
                a[i] = Math.abs(a[i]);
            }
        }
        return a;
    }

    public static boolean arZodisVyriskosGimines(String z){
        return (z.toLowerCase().endsWith("as") || z.toLowerCase().endsWith("us") || z.toLowerCase().endsWith("is"));
    }

    public static int kiekMasyveVyriskosGiminesZodziu(String[] a){
        int kiekis = 0;
        for (String s : a) {
            if (arZodisVyriskosGimines(s)) {
                kiekis++;
            }
        }
        return kiekis;
    }

    public static double suapvalinti(double x){
        return Math.round(x * 100d) / 100d;
    }


}
