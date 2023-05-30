public class uzduotis2 {
    public static void main(String[] args) {
        System.out.println("arPelningas(1679.25, 2631.25) = " + arPelningas(1679.25, 2631.25));
        System.out.println("arPelningas(2300.25, 2300.25) = " + arPelningas(2300.25, 2300.25));
        System.out.println("arPelningas(1325.25, 2631.25) = " + arPelningas(1325.25, 1131.25));

    }
    public static boolean arPelningas(double islaidos, double pajamos){
        return pajamos > islaidos;
    }
}
