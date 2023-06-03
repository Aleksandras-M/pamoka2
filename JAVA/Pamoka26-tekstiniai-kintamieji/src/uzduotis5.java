public class uzduotis5 {
    public static void main(String[] args) {
        String z1 = "ananasas";
        int a1 = 5;
        int b1 = 7;
        String z2 = "ananasas";
        int a2 = 0;
        int b2 = 7;
        System.out.println("arSimboliaiVienodi(z1, a1, b1) = " + arSimboliaiVienodi(z1, a1, b1));
        System.out.println("arSimboliaiVienodi(z2, a2, b2) = " + arSimboliaiVienodi(z2, a2, b2));
    }

    public static boolean arSimboliaiVienodi(String z, int a, int b){
        return z.charAt(a) == z.charAt(b);
    }
}
