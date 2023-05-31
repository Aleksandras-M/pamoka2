//Sukurkite programą, kuri nuskaito skaičių iš konsolės, tada nuskaito procentus iš konsolės.
//        Apskaičiuoja skaičių pakeltą procentine dalimi ir išveda rezultatą į konsolę.

import java.util.Scanner;

public class uzduotis4 {
    public static void main(String[] args) {
        Scanner ivedimas = new Scanner(System.in);
        System.out.println("Įveskite skaičių:");
        double skaicius = ivedimoTikrinimas(ivedimas);
        System.out.println("įveskite procentus");
        double procentas = ivedimoTikrinimas(ivedimas);
        System.out.println("Pakeitus " + skaicius + " " + procentas + " procentu gausite " +
                pakeistiSkaiciuProcentu(skaicius, procentas));

    }

    public static double ivedimoTikrinimas(Scanner scanner) {
        double number = 0;
        if (!scanner.hasNextDouble()) {
            System.out.println("Netinkamas įvedimas, prašome įvesti skaičių:");
            scanner.next();
        } else {
            number = scanner.nextDouble();
        }
        return number;
    }

    public static double pakeistiSkaiciuProcentu(double skaicius, double procentas) {
        if (procentas == 0) {
            return skaicius;
        } else {
            return skaicius + (skaicius * (procentas / 100));
        }
    }
}