package uzduotis1;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Apskritimas a1 = new Apskritimas(5);

        Apskritimas a2 = new Apskritimas();
        a2.spindulys = 12.5;


        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a1.diametras = " + a1.diametras());
        System.out.println("a2.diametras = " + a2.diametras());
        a1.padidintiApskritima(5);
        a2.padidintiApskritima(10);
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a1.ilgis() = " + a1.ilgis());
        System.out.println("a2.ilgis() = " + a2.ilgis());
        System.out.println("a1.plotas() = " + a1.plotas());
        System.out.println("a2.plotas() = " + a2.plotas());


    }

}
