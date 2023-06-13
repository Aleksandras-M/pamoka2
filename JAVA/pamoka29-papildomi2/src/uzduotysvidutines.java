import java.util.Arrays;

public class uzduotysvidutines {
    public static void main(String[] args) {

        int[] intMasyvas = {-3, 14, -6, 7, -9, 22, -17, 20, -4, 10};
        double[] doubleMasyvas = {-16.32, 8.74, -21.05, 4.19, -12.63, 17.81, 3, 19.47, -7.86, 0.57};
        double x = 3;
        System.out.println("lyginiuSkaiciuMasyveSkaicius(intMasyvas) = " + lyginiuSkaiciuMasyveSkaicius(intMasyvas));
        System.out.println("neigiamuSkaiciuFiltravimas(intMasyvas) = " + Arrays.toString(neigiamuSkaiciuFiltravimas(intMasyvas)));
        System.out.println("arSkaiciusYraMasyve(doubleMasyvas, x) = " + arSkaiciusYraMasyve(doubleMasyvas, x));
        System.out.println("intMasyvoMediana(intMasyvas) = " + intMasyvoMediana(intMasyvas));
        System.out.println("masyvoApsukimas(intMasyvas) = " + Arrays.toString(masyvoApsukimas(intMasyvas)));
    }

    public static int lyginiuSkaiciuMasyveSkaicius(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] neigiamuSkaiciuFiltravimas(int[] arr) {
        int[] neigiamuMasyvas = new int[arr.length];
        int neigiamuIndeksas = 0;

        for (int j : arr) {
            if (j < 0) {
                neigiamuMasyvas[neigiamuIndeksas] = j;
                neigiamuIndeksas++;
            }
        }
        return Arrays.copyOf(neigiamuMasyvas, neigiamuIndeksas);
    }

    public static boolean arSkaiciusYraMasyve (double[] arr, double x){
        int count = 0;
        for (double v : arr) {
            if (v == x) {
                count++;
            }
        }
        return count > 0;
    }

    public static int intMasyvoMediana (int[] arr){
        return arr.length % 2 == 0 ? arr[((arr.length / 2) + ((arr.length/2) + 1)) / 2] : arr[arr.length / 2];
    }

    public static int[] masyvoApsukimas(int[] arr){
        int[] apsuktasMasyvas = new int[arr.length];
        int n = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            apsuktasMasyvas[n] = arr[i];
            n++;
        }
        return apsuktasMasyvas;
    }
}
