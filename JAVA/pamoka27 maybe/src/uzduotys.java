import java.util.Scanner;

public class uzduotys {
    public static void main(String[] args) {
        Scanner ivedimas = new Scanner(System.in);
        System.out.println("Įveskite pradžią:");
        int pradzia = ivedimoTikrinimasArSkaicius(ivedimas);
        System.out.println("Įveskite pabaigą:");
        int pabaiga = ivedimoTikrinimasArSkaicius(ivedimas);

        System.out.println("Skaičiai nuo pradžios iki pabaigos:");
        visiSkaiciaiNuoPradziosIkiPabaigos(pradzia, pabaiga);

        System.out.println("Skaičiai nuo pabaigos iki pradžios:");
        visiSkaiciaiNuoPabaigosIkiPradzios(pradzia, pabaiga);

        System.out.println("Įveskite kiek brukšniukų reikia:");
        int n = ivedimoTikrinimasArSkaicius(ivedimas);
        bruksniukaiNKartu(n);

        ivedimas.nextLine();
        System.out.println("Įveskite zodį kuri norite tikrinti:");
        String zodis = ivedimas.nextLine();
        System.out.println("Įveskite reidę kurios kiekį norite suskaičiuoti:");
        char c = ivedimas.next().charAt(0);
        kiekTokiuPaciuRaidziuZodyje(zodis, c);

        System.out.println("Įveskite skaičių kurį norite patikrinti ar jis pirminis:");
        int x1 = ivedimoTikrinimasArSkaicius(ivedimas);
        System.out.println("arPirminisSkaicius(x1) = " + arPirminisSkaicius(x1));

        System.out.println("Įveskite skaičių kurio skaitmenų suma norite rasti:");
        int x2 = ivedimoTikrinimasArSkaicius(ivedimas);
        System.out.println("skaiciausSkaitmenuSuma(x2) = " + skaiciausSkaitmenuSuma(x2));

    }

    public static void visiSkaiciaiNuoPradziosIkiPabaigos(int pradzia, int pabaiga) {
        for (int i = pradzia; i <= pabaiga; i++) {
            System.out.println(i);
        }
    }

    public static void visiSkaiciaiNuoPabaigosIkiPradzios(int pradzia, int pabaiga) {
        for (int i = pabaiga; i >= pradzia; i--) {
            System.out.println(i);
        }
    }

    public static void bruksniukaiNKartu(int n) {
        String bruksniai = "";
        for (int i = 0; i < n; i++) {
            bruksniai += "-";
        }
        System.out.println(bruksniai);
    }

    public static void kiekTokiuPaciuRaidziuZodyje(String zodis, char c) {
        int raidziuSkaicius = 0;
        for (int i = 0; i < zodis.length(); i++) {
            if (zodis.charAt(i) == c) raidziuSkaicius++;
        }
        System.out.println("zodyje ivesta raide kartojasi " + raidziuSkaicius + " kartus");
    }

    public static boolean arPirminisSkaicius(int x) {
        if (x <= 1) {
            return false;
        }

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int skaiciausSkaitmenuSuma(int x){
        int suma = 0;
        while (x > 0){
            suma += x % 10;
            x /= 10;
        }return suma;
    }

    public static int ivedimoTikrinimasArSkaicius(Scanner scanner) {
        int number = 0;
        if (!scanner.hasNextInt()) {
            System.out.println("Netinkamas įvedimas, prašome įvesti skaičių:");
            scanner.next();
        } else {
            number = scanner.nextInt();
        }
        return number;
    }

}
