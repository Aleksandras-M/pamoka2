package uzduotis2;

import java.util.Arrays;

public class PagrindinePrograma {
    public static void main(String[] args) {

        Preke preke1 = new Preke(1, "kede", 12.99, 272, "baldai");
        Preke preke2 = new Preke(2, "stalas", 120.99, 22, "baldai");
        Preke preke3 = new Preke(3, "šaukštas", 0.99, 2720, "Stalo Įrankiai");
        Preke[] prekes = new Preke[]{ preke1, preke2, preke3};
        System.out.println(Arrays.toString(prekes));
        System.out.println("prekes[0] = " + prekes[0]);
        System.out.println("prekes[prekes.length -1] = " + prekes[prekes.length -1]);
        System.out.println("prekes[1].getKaina() = " + prekes[1].getKaina());
    }
}
