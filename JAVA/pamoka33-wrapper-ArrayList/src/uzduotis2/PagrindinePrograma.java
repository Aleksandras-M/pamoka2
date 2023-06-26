package uzduotis2;

public class PagrindinePrograma {
    public static void main(String[] args) {

        ManoIntList arr = new ManoIntList(0);

        arr.ideti(9);
        System.out.println(arr);
        arr.ideti(10);
        System.out.println(arr);
        arr.ideti(11);
        System.out.println(arr);
        arr.ideti(12);
        System.out.println(arr);
        arr.ideti(13);
        System.out.println(arr);

        arr.masyvoElementoPasalinimas(2);
        System.out.println(arr);



    }
}
