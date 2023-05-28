public class uzduotis2 {
    public static void main(String[] args) {
        int x = 21;
        int y = 7;
        funkcija(x, y);

    }
    public static void funkcija(int x, int y){
        if(x % 2 == 0)
            System.out.println("x * y = " + x * y);
        else
            System.out.println("y - x = " + (y - x));
    }
}