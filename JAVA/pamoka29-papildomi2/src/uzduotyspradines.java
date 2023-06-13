import java.util.Arrays;

public class uzduotyspradines {
    public static void main(String[] args) {

        int[] intMasyvas = {-3, 14, -6, 7, -9, 22, -17, 20, -4, 10};
        double[] doubleMasyvas = {-16.32, 8.74, -21.05, 4.19, -12.63, 17.81, -2.95, 19.47, -7.86, 0.57};
        int x = 5;
        int y = 2;

        System.out.println("paskutinisMasyvoElementas(doubleMasyvas) = " + paskutinisMasyvoElementas(doubleMasyvas));
        System.out.println("intMasyvoKopija(intMasyvas) = " + Arrays.toString(intMasyvoKopija(intMasyvas)));
        System.out.println("intMasyvoElementoNuoGaloGrazinimas(intMasyvas) = " + intMasyvoElementoNuoGaloGrazinimas(intMasyvas, x));
        System.out.println("intMasyvoDviejuElementuSuma() = " + intMasyvoDviejuElementuSuma(intMasyvas, x, y));
        System.out.println("doubleMasyvoVidurkis(doubleMasyvas) = " + doubleMasyvoVidurkis(doubleMasyvas));

    }

    public static double paskutinisMasyvoElementas(double[] array){
        return array[array.length - 1];
    }

    public static int[] intMasyvoKopija(int[] array){
        int[] naujasMasyvas = new int[array.length];
        System.arraycopy(array, 0, naujasMasyvas, 0, array.length);
        return naujasMasyvas;
    }

    public static int intMasyvoElementoNuoGaloGrazinimas(int[] arr, int n){
        return arr[arr.length - n];
    }

    public static int intMasyvoDviejuElementuSuma(int[] arr, int x, int y){
        return arr[x] + arr[y];
    }

    public static double doubleMasyvoSuma(double[] arr){
        double suma = 0;
        for(double x : arr){
            suma += x;
        }
        return suma;
    }

    public static double doubleMasyvoVidurkis(double[] arr){
        return doubleMasyvoSuma(arr) / arr.length;
    }
}
