public class uzduotis5 {
    public static void main(String[] args) {
        String tekstas1 = "labas rytas";
        System.out.printf(tekstasTrisKartus(tekstas1));
        String tekstas2 = "Penktadienis";
        System.out.println(tekstasTrisKartus(tekstas2));
        String tekstas3 = "Šiandien aš programuoju";
        System.out.println(tekstasTrisKartus(tekstas3));
    }
    public static String tekstasTrisKartus(String tekstas) {
        return tekstas + " " + tekstas + " " + tekstas;
    }
}
