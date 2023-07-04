package uzduotis1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {

        Preke preke = nuskaitymasIsKonsoles();
        visuPrekiuIrasymasIFaila(preke, "prekes.csv");
        System.out.println("preke = " + preke);
        System.out.println("Arrays.toString(prekiuNuskaitymasIsFailo(\"prekes.csv\")) = " +
                Arrays.toString(prekiuNuskaitymasIsFailo("prekes.csv")));
    }

    public static Preke[] prekiuNuskaitymasIsFailo(String failoPavadinimas) {
        File failas = new File(failoPavadinimas);
        Preke[] prekes;
        try {
            Scanner nuskaitymas = new Scanner(failas);
            int n = nuskaitymas.nextInt();
            prekes = new Preke[n];
            nuskaitymas.nextLine();
            for (int i = 0; i < n; i++) {
                String[] atskirtaEilute = nuskaitymas.nextLine().split(",");
                prekes[i] = new Preke(
                        Integer.parseInt(atskirtaEilute[0]),
                        atskirtaEilute[1],
                        Double.parseDouble(atskirtaEilute[2]),
                        Integer.parseInt(atskirtaEilute[3]),
                        atskirtaEilute[4]
                        );
            }nuskaitymas.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return prekes;
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
    public static void prekesIrasymasIFaila(Preke preke,String failoPavadinimas){
        try {
            FileWriter failas = new FileWriter(failoPavadinimas, true);
            BufferedWriter buffer = new BufferedWriter(failas);
            buffer.newLine();
            buffer.write(preke.CSVFormatui());
            buffer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void visuPrekiuIrasymasIFaila(Preke preke,String failoPavadinimas){
        try {
            Preke[] prekes = prekiuNuskaitymasIsFailo(failoPavadinimas);
            Preke[] naujosPrekes = Arrays.copyOf(prekes, prekes.length + 1);
            naujosPrekes[naujosPrekes.length - 1] = preke;
            int n = naujosPrekes.length;

            FileWriter failas = new FileWriter(failoPavadinimas);
            BufferedWriter buffer = new BufferedWriter(failas);

            buffer.write(String.valueOf(n));
            for (Preke naujosPreke : naujosPrekes) {
                prekesIrasymasIFaila(naujosPreke, failoPavadinimas);
            }
            buffer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
Math.floor(value * 100) / 100


}
