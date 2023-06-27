package uzduotis1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Preke[] prekes = prekiuNuskaitymasIsFailo("prekes.csv");
        System.out.println(Arrays.toString(prekes));
    }

    public static Preke[] prekiuNuskaitymasIsFailo(String failoPavadinimas) {
        File failas = new File(failoPavadinimas);
        Preke[] prekes;
        try {
            Scanner skaitytuvas = new Scanner(failas);
            int n = skaitytuvas.nextInt();
            prekes = new Preke[n];
            skaitytuvas.nextLine();
            for (int i = 0; i < n; i++) {
                String[] prekiuEiluteAtskirta = skaitytuvas.nextLine().split(",");
                int id = Integer.parseInt(prekiuEiluteAtskirta[0]);
                String pavadinimas = prekiuEiluteAtskirta[1];
                double kaina = Double.parseDouble(prekiuEiluteAtskirta[2]);
                int kiekisSandelyje = Integer.parseInt(prekiuEiluteAtskirta[3]);
                String kategorija = prekiuEiluteAtskirta[4];
                Preke preke = new Preke(id, pavadinimas, kaina, kiekisSandelyje, kategorija);
                prekes[i] = preke;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return prekes;
    }
}
