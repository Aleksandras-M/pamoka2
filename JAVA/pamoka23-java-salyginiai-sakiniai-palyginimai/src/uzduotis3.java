public class uzduotis3 {
    public static void main(String[] args) {
        int x1 = 20;
        int y1 = 5;
        int x2 = 14;
        int y2 = 6;
        System.out.println(arKartotinis(x1, y1));
        System.out.println(arKartotinis(x2, y2));
    }
    public static boolean arKartotinis(int x, int y){
        return x % y == 0;
    }
}
