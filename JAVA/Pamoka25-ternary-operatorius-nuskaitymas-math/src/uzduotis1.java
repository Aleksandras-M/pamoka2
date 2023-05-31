import java.util.Scanner;

public class uzduotis1 {
    public static void main(String[] args) {

        Scanner ivedimas = new Scanner(System.in);

        System.out.println("Įveskite apskritimo spindulį:");
        double r = ivedimoTikrinimas(ivedimas);


        System.out.println("Su įvestu apskritimo spinduliu " + r + ": ");
        System.out.println("apskritimo plotas yra " + apskritimoPlotas(r));
        System.out.println("apskritimo diametras yra " + apskritimoDiametras(r));
        System.out.println("apskritimo ilgis yra " + apskritimoIlgis(r));

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

    public static double apskritimoPlotas(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double apskritimoDiametras(double r) {
        return r * 2;
    }

    public static double apskritimoIlgis(double r) {
        return 2 * Math.PI * r;
    }
}

