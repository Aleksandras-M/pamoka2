import java.io.Serializable;
import java.util.Scanner;

public class uzduotis4 {
    public static void main(String[] args) {
        String zodis1 = "ananasas";
        int i1 = 5;
        String zodis2 = "Sakinys.";
        int i2 = 3;
        String zodis3 = "meška";
        int i3 = 2;
        String zodis4 = "meška";
        int i4 = 10;

        System.out.println("raideSuIndeksuX(zodis1, i1) = " + raideSuIndeksuX(zodis1, i1));
        System.out.println("raideSuIndeksuX(zodis2, i2) = " + raideSuIndeksuX(zodis2, i2));
        System.out.println("raideSuIndeksuX(zodis3, i3) = " + raideSuIndeksuX(zodis3, i3));
        System.out.println("raideSuIndeksuX(zodis3, i3) = " + raideSuIndeksuX(zodis4, i4));
    }

    public static String raideSuIndeksuX (String zodis, int x){

        if (x < zodis.length()) {
            return String.valueOf(zodis.charAt(x));
        } else {
            return "Per didelis indeksas";
        }
    }
}
