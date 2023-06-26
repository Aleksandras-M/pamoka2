package uzduotis1;

import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {

        Preke preke1 = naujosPrekesIvedimasKonsoleje();
        System.out.println(preke1);
        Preke preke2 = naujosPrekesIvedimasKonsoleje();
        System.out.println(preke2);
        System.out.println("preke2.getKaina() = " + preke2.getKaina());
        System.out.println("preke1.getPavadinimas() = " + preke1.getPavadinimas());

    }

    public static Preke naujosPrekesIvedimasKonsoleje(){

        Scanner ivedimas = new Scanner(System.in);
        Preke preke = new Preke();
        System.out.println("Įveskite prekės ID:");
        preke.setId(ivedimas.nextInt());
        ivedimas.nextLine();
        System.out.println("Įveskite prekės pavadinimą:");
        preke.setPavadinimas(ivedimas.nextLine());
        System.out.println("Įveskite prekės kainą:");
        preke.setKaina(ivedimas.nextDouble());
        System.out.println("Įveskite prekės kiekį sandelyje:");
        preke.setKiekisSandelyje(ivedimas.nextInt());
        ivedimas.nextLine();
        System.out.println("Įveskite prekės kategoriją:");
        preke.setKategorija(ivedimas.nextLine());
        return preke;

    }
}
