package uzduotis1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> sarasas = new ArrayList<>();
        Scanner ivedimas = new Scanner(System.in);
        sarasoIvedimas(ivedimas, sarasas);
        System.out.println("sarasas = " + sarasas);
        System.out.println("sarasas.get(sarasas.size()-1)) = " + sarasas.get(sarasas.size()-1));
        System.out.println("sarasoSuma(sarasas) = " + sarasoSuma(sarasas));
    }


    public static void sarasoIvedimas(Scanner scanner, List<Integer> sarasas) {
        System.out.println("Įveskite skaičių, kurį norite pridėti į sąrašą (įveskite 'stop' norėdami baigti):");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                System.out.println("Įveskite skaičių, kurį norite pridėti į sąrašą (įveskite 'stop' norėdami baigti):");
                int number = scanner.nextInt();
                sarasas.add(number);
            } else if (scanner.hasNext("stop")) {
                break;
            } else {
                System.out.println("Netinkamas įvesties formatas. Prašome įvesti skaičių arba 'stop'.");
                scanner.next();
            }
        }
    }
    
    public static int sarasoSuma(List<Integer> sarasas){
        int suma = 0;
        for(int i : sarasas){
            suma += i;
        }return suma;
        
    }
}
