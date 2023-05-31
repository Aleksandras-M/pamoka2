//Sukurkite programą, kuri nuskaito du skaičius ir apskaičiuoja kiek procentų yra pirmas skaičius pakeltas/pamažintas,
//        jeigu norėtume gauti antrą skaičių. T.y., jei sk1 = 20, o sk2 = 40, tai buvo pakelta 100%,
//        jeigu sk1 = 50, o sk2 = 75, tai buvo pakelta 50%; jeigu sk1 = 100, o sk2 = 50, tai buvo sumažinta 50%


import java.util.Scanner;

public class uzduotis5 {
    public static void main(String[] args) {
        Scanner ivedimas = new Scanner(System.in);
        System.out.println("Įveskite pirmą skaičių:");
        double sk1 = ivedimoTikrinimas(ivedimas);
        System.out.println("Įveskite antrą skaičių:");
        double sk2 = ivedimoTikrinimas(ivedimas);
        procentoRadimoIsvedimas(procentoRadimas(sk1, sk2));

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

    public static double procentoRadimas(double a, double b) {
        if (a == 0) {
            return 0;
        } else {
            return ((b - a) / Math.abs(a)) * 100;
        }
    }

    public static void procentoRadimoIsvedimas(double a) {
        if (a == 0) {
            System.out.println("Pirmą skaičių reikia pakeisti 0% kad gauti antrą skaičių");
        } else {
            if (a > 0) {
                System.out.println("Pirmą skaičių reikia padidinti " + a + " % kad gauti antrą skaičių");
            } else {
                System.out.println("Pirmą skaičių reikia sumažinti " + Math.abs(a) + " % kad gauti antrą skaičių");
            }
        }
    }
}
