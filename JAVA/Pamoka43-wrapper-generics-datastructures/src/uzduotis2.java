import java.util.ArrayList;

public class uzduotis2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(150);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        System.out.println("a = " + a);
        a.remove(4);
        System.out.println("a = " + a);
        a.remove((Integer)150);
        System.out.println("a = " + a);
        System.out.println("(a.get(0) + a.get(6)) = " + (a.get(0) + a.get(6)));
        a.set(7, -10);
        System.out.println("a = " + a);
        int temp = a.get(3);
        a.set(3, a.get(4));
        a.set(4, temp);
        System.out.println("a = " + a);

        System.out.println("maziausiasSkaicius(a) = " + maziausiasSkaicius(a));

        System.out.println("elementuSandauga(a) = " + elementuSandauga(a));

        System.out.println("teigiamuElementusuma(a) = " + teigiamuElementusuma(a));
    }

    public static int maziausiasSkaicius (ArrayList<Integer> a){
        int min = a.get(0);
        for (Integer integer : a) {
            if (min > integer) {
                min = integer;
            }
        }
        return min;
    }

    public static int elementuSandauga (ArrayList<Integer> a){
        int sandauga = 1;
        for (Integer integer : a) {
            sandauga *= integer;
        }
        return sandauga;
        }

    public static int teigiamuElementusuma(ArrayList<Integer> a) {
        int suma = 0;
        for (Integer integer : a) {
            if (integer > 0) {
                suma += integer;
            }
        }
        return suma;
    }

    
}



