public class uzduotis6 {
    public static void main(String[] args) {
        String s1 = "ananasas";
        String s2 = "anakonda";
        String s3 = "antanas";
        String s4 = "mašina";
        String s5 = "ananasas";
        String s6 = "ąsotis";

        System.out.println("kurisZodisArtimesnis(s1, s2) = " + kurisZodisArtimesnis(s1, s2));
        System.out.println("kurisZodisArtimesnis(s1, s2) = " + kurisZodisArtimesnis(s3, s4));
        System.out.println("kurisZodisArtimesnis(s1, s2) = " + kurisZodisArtimesnis(s5, s6));
    }

    public static String kurisZodisArtimesnis(String z1, String z2) {
        int palyginimas = z1.compareToIgnoreCase(z2);

        if (palyginimas < 0) {
            return z1;
        } else if (palyginimas > 0) {
            return z2;
        } else {
            return "Lygūs zodžiai";
        }
    }
}
