public class uzduotis6 {
    public static void main(String[] args) {
        arKeliamieji(1602);
        arKeliamieji(2000);
        arKeliamieji(1500);
        arKeliamieji(1600);
    }

    public static void arKeliamieji(int x) {
        if (x >= 1582) {
            System.out.println("arKeliamieji (" + x + ") = " + (x % 4 == 0));
        }
    }
}
