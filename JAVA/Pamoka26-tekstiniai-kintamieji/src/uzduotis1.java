public class uzduotis1 {
    public static void main(String[] args) {
        String zodis1 = "Antanas";
        int x1 = 5;
        String zodis2 = "ropė";
        int x2 = 7;
        System.out.println("arZodisIlgesnisNeiSkaicius(zodis1, x1) = " + arZodisIlgesnisNeiSkaicius(zodis1, x1));
        System.out.println("arZodisIlgesnisNeiSkaicius(zodis2, x2) = " + arZodisIlgesnisNeiSkaicius(zodis2, x2));
    }

    public static boolean arZodisIlgesnisNeiSkaicius(String zodis, int x){
        return zodis.length() > x;
    }
}
