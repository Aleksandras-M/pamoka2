public class uzduotis9 {
    public static void main(String[] args) {
        System.out.println("hero(4, 5) = " + hero(4, 5));
        System.out.println("hero(1503, 751) = " + hero(1503, 751));;
        System.out.println("hero(0, 1) = " + hero(0, 1));
        System.out.println("hero(100, 40) = " + hero(100, 40));
    }
    public static boolean hero(int bullets, int dragons) {
        return (bullets / 2) >= dragons;
    }
}
