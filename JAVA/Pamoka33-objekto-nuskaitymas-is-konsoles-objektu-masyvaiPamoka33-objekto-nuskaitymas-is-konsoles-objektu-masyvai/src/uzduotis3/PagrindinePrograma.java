package uzduotis3;

import java.util.Arrays;
import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {
        
        Preke[] prekes = prekiuMasyvoNuskaitymas();
        System.out.println(Arrays.toString(prekes));
        System.out.println("prekes[0].getKategorija() = " + prekes[0].getKategorija());
    }

    public static Preke nuskaitymasIsKonsoles() {
        Scanner ivedimas = new Scanner(System.in);
        Preke preke = new Preke();
        System.out.println("Įveskite prekės pavadinimą:");
        preke.setPavadinimas(ivedimas.next());
        System.out.println("Įveskite prekės kategoriją:");
        preke.setKategorija(ivedimas.next());
        System.out.println("Įveskite prekės Id");
        preke.setId(ivedimas.nextInt());
        System.out.println("Įveskite prekės kainą:");
        preke.setKaina(ivedimas.nextDouble());
        System.out.println("Įveskite prekės kiekį sandelyje:");
        preke.setKiekisSandelyje(ivedimas.nextInt());

        return preke;

    }

    public static Preke[] prekiuMasyvoNuskaitymas() {
        Scanner ivedimas = new Scanner(System.in);
        System.out.println("Įveskite kiek prekių norite įdėti:");
        int n = ivedimas.nextInt();
        Preke[] prekes = new Preke[n];
        for (int i = 0; i < n; i++) {
            prekes[i] = nuskaitymasIsKonsoles();
        }
        return prekes;
    }
}
