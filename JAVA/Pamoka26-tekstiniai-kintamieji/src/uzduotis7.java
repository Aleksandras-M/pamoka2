import java.util.Scanner;

public class uzduotis7 {
    public static void main(String[] args) {

        String s1 = "ana1konda";
        int i1 = 4;
        int i2 = 6;
        System.out.println("arSimbolisSuIndeksuYraSkaicius(s1, i1) = " + arSimbolisSuIndeksuYraSkaicius(s1, i1));
        System.out.println("arSimbolisSuIndeksuYraSkaicius(s1, i2) = " + arSimbolisSuIndeksuYraSkaicius(s1, i2));
        Scanner ivedimas = new Scanner(System.in);
        System.out.println("Įveskite tikrinamą tekstą:");
        String z1 = ivedimas.nextLine();
        System.out.println("Įveskite indeksą:");
        int x1 = arNePerDidelisIndeksas(ivedimas, z1);
        System.out.println("Ar simbolis yra skaičius :" + arSimbolisSuIndeksuYraSkaicius(z1, x1));


    }

    public static boolean arSimbolisSuIndeksuYraSkaicius (String z, int i){
        return Character.isDigit(z.charAt(i));
    }

    public static int arNePerDidelisIndeksas(Scanner scanner, String z){
        int index = scanner.nextInt();
            while (index < 0 || index >= z.length()) {
                System.out.println("Įvestas indeksas yra už teksto ribų, prašome įvesti naują indeksą:");
                scanner.next();
            }
        return index;
    }
}
