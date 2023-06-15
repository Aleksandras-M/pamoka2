import java.lang.reflect.Array;
import java.util.Arrays;

public class uzduotyspapildomos {
    public static void main(String[] args) {

        int[] intMasyvas = {-3, 14, -6, 7, -9, 22, -17, 20, -4, 10};
        double[] doubleMasyvas = {-16.32, 8.74, -21.05, 4.19, -12.63, 17.81, 3, 19.47, -7.86, 0.57};
        boolean[] booleanMasyvas = {false, false, true, false, true, true, false, true, false, true, true};
        int x = 2;
        int y = 5;

        System.out.println("arMasyvasSurikiuotas(doubleMasyvas) = " + arMasyvasSurikiuotas(doubleMasyvas));

        System.out.println("trijuDidziausiuSkaiciuSuma(intMasyvas) = " + trijuDidziausiuSkaiciuSuma(intMasyvas));

        System.out.println("daugiauTrueArFalse(booleanMasyvas) = " + daugiauTrueArFalse(booleanMasyvas));

        System.out.println("masyvoElementuSukeitimas(doubleMasyvas, x, y) = " +
                Arrays.toString(masyvoElementuSukeitimas(doubleMasyvas, x, y)));

        System.out.println("Arrays.toString(masyvoLyderiai(intMasyvas)) = " + Arrays.toString(masyvoLyderiai(intMasyvas)));
    }

    public static boolean arMasyvasSurikiuotas (double[] arr){
        double[] surikiuotasMasyvas = arr.clone();
        Arrays.sort(surikiuotasMasyvas);
;        return Arrays.equals(arr, surikiuotasMasyvas);
    }

    public static int trijuDidziausiuSkaiciuSuma (int[] arr){
        int[] arrSurikiuotas = arr.clone();
        Arrays.sort(arrSurikiuotas);
        return arrSurikiuotas[arrSurikiuotas.length - 1] + arrSurikiuotas[arrSurikiuotas.length - 2] +
                arrSurikiuotas[arrSurikiuotas.length - 3];
        
    }

    public static boolean daugiauTrueArFalse (boolean[] arr){
        int trueKiekis = 0;
        int falseKiekis = 0;
        for(boolean a: arr){
            if (a == true){
                trueKiekis++;
            }else{
                falseKiekis++;
            }
        }
        return trueKiekis > falseKiekis;
    }

    public static double[] masyvoElementuSukeitimas (double[] arr, int x, int y){
        double laikinas = arr[x - 1];
        arr[x - 1] = arr[y - 1];
        arr[y - 1] = laikinas;
        return arr;
    }

    public static int[] masyvoLyderiai(int[] arr) {
        int[] lyderiai = new int[lyderiuKiekis(arr)];
        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                lyderiai[index] = arr[i];
                max = arr[i];
                index++;
            }
        }
        return lyderiai;
    }

    public static int lyderiuKiekis(int[] arr) {
        int max = Integer.MIN_VALUE;
        int lyderiuSkaicius = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                lyderiuSkaicius++;
            }
        }
        return lyderiuSkaicius;
    }
}
