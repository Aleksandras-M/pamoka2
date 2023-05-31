//Sukurkite programą, kuri nuskaito tris trikampio kraštines,
//        apskaičiuoja trikampio perimetrą, apskaičiuoja trikampio plotą,
//        patikrina ar trikampis yra statusis/lygiašonis/lygiakraštis/paprastas ir visa tai išveda į konsolę.
//PVZ:
//Lygiakraštis trikampis a = 5, b = 5, c = 5
//Lygiašonis trikampis a = 4, b = 4, c = 6
//Statusis trikampis a = 3, b = 4, c = 5
//Paprastas trikampis a = 7, b = 9, c = 11
//nesusidarys trikampis a = 1, b = 2, c = 4

import java.util.Scanner;

public class uzduotis3 {
    public static void main(String[] args) {
        Scanner ivedimas = new Scanner(System.in);
        System.out.println("Įveskite pirmą trikampio kraštinę:");
        double k1 = ivedimoTikrinimas(ivedimas);
        System.out.println("Įveskite antrą trikampio kraštinę:");
        double k2 = ivedimoTikrinimas(ivedimas);
        System.out.println("Įveskite trečią trikampio kraštinę:");
        double k3 = ivedimoTikrinimas(ivedimas);

        if (arSusidaroTrikampis(k1, k2, k3) == true){
            System.out.println("Trikampio perimetras yra " + trikampioPerimetras(k1, k2, k3));
            System.out.println("Trikampio plotas yra " + trikampioPlotasHeronoFormule(k1, k2, k3));
            System.out.println(trikampioTipas(k1, k2, k3));
        }else {
            System.out.println("Su įvestomis kraštinėmis trikampio sudaryti negalima");
        }
    }

    public static double ivedimoTikrinimas(Scanner scanner) {
        double number;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Netinkamas įvedimas, prašome įvesti skaičių:");
                scanner.next();
            }
            number = scanner.nextDouble();
            if (number <= 0)
                System.out.println("Įvedamas skaičius negali buti 0 arba neigiamas, prašome įvesti dar kartą:");
        } while (number <= 0);
        return number;
    }

    public static boolean arSusidaroTrikampis(double a, double b, double c) {
        return a < b + c && b < a + c && c < b + a;
    }
    public static double trikampioPerimetras(double a, double b, double c){
        return a + b + c;
    }

    public static double trikampioPlotasHeronoFormule(double a, double b, double c){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

    public static String trikampioTipas(double a, double b, double c){
        if (a == b && a == c) {
            return "Trikampis yra lygiakraštis";
        } else if (a == b || a == c || b == c) {
            return "Trikampis yra lygiašonis";
        } else if (a == Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2)) || b == Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2)) ||
                c == Math.sqrt(Math.pow(b, 2) + Math.pow(a, 2))) {
            return "Trikampis yra statusis";
        } else {
            return "Trikampis yra paprastas";
        }
    }
}
