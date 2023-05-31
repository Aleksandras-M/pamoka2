import java.util.Scanner;

public class uzduotis2 {
    public static void main(String[] args) {
        Scanner ivedimas = new Scanner(System.in);
        System.out.println("Įveskite stačiakampio ilgį:");
        double ilgis = ivedimoTikrinimas(ivedimas);
        System.out.println("Įveskite stačiakampio plotį:");
        double plotis = ivedimoTikrinimas(ivedimas);
        System.out.println("Stačiakampio plotas yra " + suapvalinti(staciakampioPlotas(ilgis, plotis)));
        System.out.println("Stačiakampio perimetras yra " + suapvalinti(staciakampioPerimetras(ilgis, plotis)));
        System.out.println(plotasArPerimetrasDidesnis(staciakampioPlotas(ilgis, plotis), staciakampioPerimetras(ilgis, plotis)));


    }

    public static double ivedimoTikrinimas(Scanner scanner) {
        double number;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Netinkamas įvedimas, prašome įvesti skaičių:");
                scanner.next();
            }
            number = scanner.nextDouble();
            if (number <= 0) {
                System.out.println("Įvedamas skaičius negali buti 0 arba neigiamas, prašome įvesti dar kartą:");
            }
        } while (number <= 0);
        return number;
    }

    public static double staciakampioPlotas(double x, double y){
        return x * y;
    }

    public static double staciakampioPerimetras(double x, double y){
        return 2 *(x + y);
    }

    public static String plotasArPerimetrasDidesnis(double plotas, double perimetras){
        if (plotas == perimetras){
            return "Plotas ir perimetras yra lygus";
        } else {
            if (plotas > perimetras){
                return "Stačiakampio plotas yra didesnis uz perimetrą";
            } else {
                return "Stačiakampio perimetras yra didesnis už plotą";
            }
        }
    }

    public static double suapvalinti(double x){
        return Math.round(x * 100d) / 100d;
    }
}
