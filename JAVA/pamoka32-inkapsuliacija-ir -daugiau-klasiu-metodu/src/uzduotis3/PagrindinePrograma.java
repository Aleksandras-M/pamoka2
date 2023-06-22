package uzduotis3;

import java.text.DecimalFormat;

public class PagrindinePrograma {
    public static void main(String[] args) {



        Preke preke1 = new Preke("kede", 25.99, "Baldai", 27);
        Preke preke2 = new Preke("kede2", 27.00, "kedes", 21);
        System.out.println("preke1.getPavadinimas() = " + preke1.getPavadinimas());

        preke1.setKiekis(14);

        System.out.println("preke1 = " + preke1);
        System.out.println("preke1.getKaina() = " + df.format(preke1.getKaina()));
        preke1.kainosKeitimasProcentais(20);
        System.out.println("preke1.getKaina() = " + df.format(preke1.getKaina()));
        preke1.kainosKeitimasProcentais(-50);
        System.out.println("preke1.getKaina() = " + df.format(preke1.getKaina()));

        int norimasKiekis1 = 50;
        int norimasKiekis2 = 3;
        System.out.println("preke1.arPakankamasLikutisSandelyje(norimasKiekis1) = " + preke1.arPakankamasLikutisSandelyje(norimasKiekis1));
        System.out.println("preke1.arPakankamasLikutisSandelyje(norimasKiekis2) = " + preke1.arPakankamasLikutisSandelyje(norimasKiekis2));

        System.out.println("preke1 ir kainosPalyginimas(preke2.getKaina()) = " + preke1.kainosPalyginimas(preke2.getKaina()));

        System.out.println("preke1 ir preke2 vienodos kategorijos =  " + preke1.arVienodosKategorijos(preke2.getKategorija()));
    }

    private static final DecimalFormat df = new DecimalFormat("0.00");
}
