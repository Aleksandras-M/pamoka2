import java.util.Arrays;
import java.util.Scanner;

public class multidimensionalArrays {
    public static void main(String[] args) {
//        kad nereiktu kaskart ivesti masyvu ivedimas komentaruose, tikrinimui del patogumo naudojami arr masyvai su jau paruostais skaiciais
//        Scanner ivedimas = new Scanner(System.in);

//        int[][] arr = dvimacioMasyvoIvedimas(ivedimas);
        int[][] arr2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] arr3 = {{1, 2, -3, 4}, {5, 6, -7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] arr4 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] arr5 = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}, {13, 14, 15}};
        int[] arr6 = {1, 2, 3, 4};
        int[] arr7 = {5, 6, 7, 8};
        int[] arr8 = {9, 10, 11, 12};
        int[] arr9 = {13, 14, 15, 16};

        System.out.println("Dvimačio masyvo išvedimas eilute:");
        System.out.println("arr2 = " + Arrays.deepToString(arr2));
        bruksniai();
        System.out.println("Dvimačio masyvo išvedimas matricoje:");
        dvimacioMasyvoIsvedimas(arr2);
        System.out.println("kuriosEilutesSumaDidziausia = " + kuriosEilutesSumaDidziausia(arr2));
        bruksniai();
        dvimacioMasyvoIsvedimas(arr2);
        System.out.println("eiluciuSuNeigiamaisSkaiciaisKiekis = " + eiluciuSuNeigiamaisSkaiciaisKiekis(arr2));
        dvimacioMasyvoIsvedimas(arr3);
        System.out.println("eiluciuSuNeigiamaisSkaiciaisKiekis = " + eiluciuSuNeigiamaisSkaiciaisKiekis(arr3));
        bruksniai();
        System.out.println("pirma matrica:");
        dvimacioMasyvoIsvedimas(arr4);
        System.out.println("Antra matrica");
        dvimacioMasyvoIsvedimas(arr5);
//        System.out.println("Arrays.deepToString(matricuSandauga(arr4, arr5)) = " + Arrays.deepToString(matricuSandauga(arr4, arr5)));
        System.out.println("Matricų sąndauga:");
        dvimacioMasyvoIsvedimas(matricuSandauga(arr4, arr5));
        bruksniai();
        System.out.println("masyvai:");
        System.out.println(Arrays.toString(arr6));
        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.toString(arr8));
        System.out.println(Arrays.toString(arr9));
        System.out.println("Masyvų sudėjimas į multidimensinį masyvą:");
        System.out.println(Arrays.deepToString(masyvuSudejimasIMultidimensiniMasyva(arr6, arr7, arr8, arr9)));
//        dvimacioMasyvoIsvedimas(masyvuSudejimasIMultidimensiniMasyva(arr6, arr7, arr8, arr9));
        bruksniai();
    }

    public static void bruksniai(){
        System.out.println("---------------------------------");
    }

//    public static int[][] dvimacioMasyvoIvedimas(Scanner ivedimas){
//        System.out.println("Įveskite dvimčio masyvo eilučių skaičių:");
//        int eiluciuSkaicius = ivedimas.nextInt();
//
//        int[][] multiArr = new int[eiluciuSkaicius][];
//
//        for (int i = 0; i < multiArr.length; i++) {
//            System.out.println("Įveskite dvimčio masyvo sekančios eilutės stulpelių skaičių:");
//            int stulpeliuSkaicius = ivedimas.nextInt();
//            multiArr[i] = new int[stulpeliuSkaicius];
//            for (int j = 0; j < multiArr[i].length; j++) {
//                System.out.println("Įveskite sekančio masyvo elemento reikšmę:");
//                multiArr[i][j] = ivedimas.nextInt();
//            }
//        }
//        return multiArr;
//    }

    public static void dvimacioMasyvoIsvedimas(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static int masyvoElementuSuma(int[] arr) {
        int suma = 0;
        for (int j : arr) {
            suma += j;
        }
        return suma;
    }

    public static int kuriosEilutesSumaDidziausia(int[][] arr) {
        int eiluteSuDidziausiaSuma = 0;
        for (int i = 1; i < arr.length; i++) {
            if (masyvoElementuSuma(arr[i]) > masyvoElementuSuma(arr[i - 1])) {
                eiluteSuDidziausiaSuma = i;
            }
        }
        return eiluteSuDidziausiaSuma + 1;
    }

    public static int eiluciuSuNeigiamaisSkaiciaisKiekis(int[][] arr) {
        int eiluciuKiekis = 0;
        for (int[] ints : arr) {
            int count = 0;
            for (int anInt : ints) {
                if (anInt < 0) {
                    count++;
                }
            }
            if (count > 0) {
                eiluciuKiekis++;
            }
        }
        return eiluciuKiekis;
    }

    public static int[][] matricuSandauga(int[][] arr1, int[][] arr2) {
        int[][] naujasMasyvas = new int[0][];
        if (arr1[0].length == arr2.length) {
            naujasMasyvas = new int[arr1.length][arr2[0].length];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2[0].length; j++) {
                    int suma = 0;
                    for (int k = 0; k < arr1[0].length; k++) {
                        suma += arr1[i][k] * arr2[k][j];
                    }
                    naujasMasyvas[i][j] = suma;
                }
            }

        }
        return naujasMasyvas;
    }

    public static int[][] masyvuSudejimasIMultidimensiniMasyva(int[] arr1, int[] arr2, int[] arr3, int[] arr4){
        int[][] rezultatoMasyvas = new int[4][arr1.length];
        for (int i = 0; i < 4; i++) {
                rezultatoMasyvas[0][i] = arr1[i];
                rezultatoMasyvas[1][i] = arr2[i];
                rezultatoMasyvas[2][i] = arr3[i];
                rezultatoMasyvas[3][i] = arr4[i];
            }
        return rezultatoMasyvas;
    }
}
