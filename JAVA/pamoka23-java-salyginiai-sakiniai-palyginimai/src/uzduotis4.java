public class uzduotis4 {
    public static void main(String[] args) {
        String a1 = "Labas rytas";
        String b1 = "labas rytas";
        String a2 = "laba diena";
        String b2 = "labas vakaras";
        arTekstaiVienodi(a1, b1);
        arTekstaiVienodi(a2, b2);
    }

    public static void arTekstaiVienodi(String a, String b){
        if (a.equalsIgnoreCase(b))
            System.out.println("Tekstai yra vienodi");
         else
            System.out.println("Tekstai yra skirtingi");
    }
}
