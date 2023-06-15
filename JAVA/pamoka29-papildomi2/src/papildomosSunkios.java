import java.util.Arrays;
import java.util.HashMap;

public class papildomosSunkios {
    public static void main(String[] args) {

        int[] m1 = {5, 3, 8, 20, 7, 9, 4};
        int[] m2 = {20, 3, 4, 15, 17, 80};
        int x = 2;
        int x1 = 8;
        int x2 = 12;
        byte[] m3 = {9, 2, 4, 5, 6, 2, 1, 5, 8, 7, 2, 6, 5, 8, 9, 3, 9, 3, 2, 4, 4, 2, 8, 6, 8, 6, 9, 5, 3, 4, 8, 2,
                6, 1, 3, 3, 2, 6, 4, 7, 9, 7, 2, 9, 7, 2, 6, 5, 1, 7, 6, 1, 7, 4, 8, 2, 2, 4, 6, 8, 5, 9, 8, 7, 1, 5,
                1, 9, 1, 8, 3, 6, 3, 6, 2, 6, 3, 1, 1, 9, 9, 1, 8, 2, 3, 9, 9, 7, 3, 3, 5, 4, 4, 4, 1, 3, 9, 9, 2, 4,
                5, 5, 7, 3, 5, 9, 5, 2, 8, 9, 1, 8, 2, 8, 5, 7, 3, 2, 4, 1, 9, 8, 4, 4, 2, 2, 4, 1, 1, 4, 2, 6, 4, 5,
                2, 3, 3, 5, 7, 1, 3, 4, 9, 5, 9, 3, 5, 5, 3, 5, 2, 9, 4, 6, 1, 5, 1, 7, 8, 3, 9, 9, 6, 3, 5, 7, 1, 2,
                4, 5, 4, 7, 7, 4, 8, 4, 9, 8, 2, 3, 2, 8, 5, 5};


        System.out.println("Arrays.toString(masyvuSankirta(m1, m2)) = " + Arrays.toString(masyvuSankirta(m1, m2)));

        System.out.println("masyvoElementoPasalinimas(m1, x) = " + Arrays.toString(masyvoElementoPasalinimas(m1, x)));

        System.out.println("arMasyveYraSkaicius(m1, x1) = " + arMasyveYraSkaicius(m1, x1));
        System.out.println("arMasyveYraSkaicius(m1, x2) = " + arMasyveYraSkaicius(m1, x2));

        System.out.println("Arrays.toString(masyvoRikiavimasBubbleSort(m1)) = " + Arrays.toString(masyvoRikiavimasBubbleSort(m1)));

        System.out.println("dazniausiaiPasikartojantisElementas(m3) = " + dazniausiaiPasikartojantisElementas(m3));
    }

    public static int[] masyvuSankirta(int[] a, int[] b){
        int[] sankirta = new int[Math.min(a.length, b.length)];
        int sankirtosDydis = 0;

        for (int j : a) {
            for (int k : b) {
                if (j == k) {
                    sankirta[sankirtosDydis++] = j;
                    break;
                }
            }
        }

        return Arrays.copyOf(sankirta, sankirtosDydis);
    }

    public static int[] masyvoElementoPasalinimas(int[] arr, int x){
        int[] naujasArr = new int[arr.length - 1];
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != x){
                naujasArr[ind] = arr[i];
                ind++;
            }
        }return naujasArr;
    }

    public static boolean arMasyveYraSkaicius(int[] a, int n){
        Arrays.sort(a);
        int x= 0;
        int y = a.length -1;
        while(x <= y){
            int mid = (x + y) / 2;
            if (a[mid] == n){
                return true;
            } else if(a[mid] > n){
                y = mid -1;
            }else {
                x = mid + 1;
            }
        }return false;
    }

    public static int[] masyvoRikiavimasBubbleSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }return arr;
    }

    public static int dazniausiaiPasikartojantisElementas(byte[] arr){
        HashMap<Byte, Integer> kiekiai = new HashMap<>();
        byte dazniausiasElementas = 0;
        int didziausiasKiekis = 0;
        for (byte x : arr) {
            if (kiekiai.containsKey(x)) {
                kiekiai.put(x, kiekiai.get(x) + 1);
            } else {
                kiekiai.put(x, 1);
            }
            int kiekis = kiekiai.get(x);
            if (kiekis > didziausiasKiekis) {
                didziausiasKiekis = kiekis;
                dazniausiasElementas = x;
            }
        }
        return dazniausiasElementas;
    }
}