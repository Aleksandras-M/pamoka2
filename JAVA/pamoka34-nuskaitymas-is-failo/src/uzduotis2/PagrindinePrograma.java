package uzduotis2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Filmas[] filmai = nuskaitymasIsFailo("filmai.csv");
//        System.out.println(Arrays.toString(filmai));
        filmuIsvedimasIAtskirasEilutes(filmai);
        System.out.println("geriausiaiIvertintasFilmas(filmai) = " + geriausiaiIvertintasFilmas(filmai));
        System.out.println("filmaiIvertintiGeriauNeiN(filmai, 8) = " + filmaiIvertintiGeriauNeiN(filmai, 8));
        uzsakytiFilmai(filmai);
    }

    public static Filmas[] nuskaitymasIsFailo(String failoPavadinimas) {
        File failas = new File(failoPavadinimas);
        Filmas[] filmai;
        try {
            Scanner nuskaitymas = new Scanner(failas);
            int n = nuskaitymas.nextInt();
            filmai = new Filmas[n];
            nuskaitymas.nextLine();
            for (int i = 0; i < n; i++) {
                String[] atskirtaFailoEilute = nuskaitymas.nextLine().split(",");
                filmai[i] = new Filmas(
                        Integer.parseInt(atskirtaFailoEilute[0]),
                        atskirtaFailoEilute[1],
                        Double.parseDouble(atskirtaFailoEilute[2]),
                        atskirtaFailoEilute[3],
                        Integer.parseInt(atskirtaFailoEilute[4]),
                        Integer.parseInt(atskirtaFailoEilute[5]),
                        Double.parseDouble(atskirtaFailoEilute[6]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return filmai;
    }

    public static void filmuIsvedimasIAtskirasEilutes(Filmas[] filmai) {
        for (Filmas filmas : filmai) {
            System.out.println(filmas);
        }
    }

    public static String geriausiaiIvertintasFilmas(Filmas[] filmai) {
        int geriausioFilmoIndeksas = 0;
        double geriausiasIvertinimas = 0;
        for (int i = 0; i < filmai.length; i++) {
            if (filmai[i].getIvertinimas() > geriausiasIvertinimas) {
                geriausiasIvertinimas = filmai[i].getIvertinimas();
                geriausioFilmoIndeksas = i;
            }
        }
        return filmai[geriausioFilmoIndeksas].getPavadinimas();
    }

    public static int filmaiIvertintiGeriauNeiN(Filmas[] filmai, double ivertinimas) {
        int kiekis = 0;
        for (Filmas filmas : filmai) {
            if (filmas.getIvertinimas() > ivertinimas) {
                kiekis++;
            }
        }
        return kiekis;
    }

    public static void uzsakytiFilmai(Filmas[] filmai) {
        Scanner ivedimas = new Scanner(System.in);
        double suma = 0;
        StringBuilder uzsakytiFilmai = new StringBuilder();
        System.out.println("Įveskite filmo Id (įveskite 'stop' norėdami baigti):");
        while (ivedimas.hasNext()) {
            if (ivedimas.hasNextInt()) {
                System.out.println("Įveskite filmo Id (įveskite 'stop' norėdami baigti):");
                int n = ivedimas.nextInt();
                for (Filmas filmas : filmai)
                    if (filmas.getId() == n) {
                        uzsakytiFilmai.append(filmas.getPavadinimas()).append(", ");
                        suma += filmas.getKaina();
                    }
            } else if (ivedimas.hasNext("stop")) {
                break;
            } else {
                System.out.println("Prašome įvesti skaičių arba 'stop'.");
                ivedimas.next();
            }
        }
        System.out.println("Uzsakyti filmai = " + uzsakytiFilmai + " Bendra kaina : " + suma + " Eur");
    }


}
