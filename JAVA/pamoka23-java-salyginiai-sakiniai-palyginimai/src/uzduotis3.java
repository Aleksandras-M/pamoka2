public class uzduotis3 {
    public static void main(String[] args) {
        int x1 = 20;
        int y1 = 5;
        int x2 = 14;
        int y2 = 3;
        System.out.println(arKartotinis(x1, y1));
        System.out.println(arKartotinis(x2, y2));
    }

    public static String arKartotinis(int x, int y) {
        if (y == 0) {
            return "Dalyba iš 0 negalima";
        } else {
            if (x % y == 0) {
                return "true";
            } else {
                return "false";
            }
        }
    }
}
