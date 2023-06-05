public class uzduotis8 {
    public static void main(String[] args) {

        String s1 = "anakonda";
        String s2 = "antanas";
        String s3 = "gervė";
        String s4 = "rikis";
        System.out.println("arZodisVyriskosArMoteriskosGimines(s1) = " + arZodisVyriskosArMoteriskosGimines(s1));
        System.out.println("arZodisVyriskosArMoteriskosGimines(s2) = " + arZodisVyriskosArMoteriskosGimines(s2));
        System.out.println("arZodisVyriskosArMoteriskosGimines(s3) = " + arZodisVyriskosArMoteriskosGimines(s3));
        System.out.println("arZodisVyriskosArMoteriskosGimines(s4) = " + arZodisVyriskosArMoteriskosGimines(s4));
    }

    public static String arZodisVyriskosArMoteriskosGimines(String z1) {
        if (z1.endsWith("as") || z1.endsWith("is") || z1.endsWith("ys") || z1.endsWith("us") || z1.endsWith("ius")) {
            return "vyriškos";
        } else if (z1.endsWith("a") || z1.endsWith("ė")) {
            return "moteriškos";
        } else {
            return "nežinomos";
        }
    }
}
