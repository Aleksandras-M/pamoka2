package uzduotis3;

public class PagrindinePrograma {
    public static void main(String[] args) {

        Preke preke1 = new Preke("kede", 25.99, "Baldai", 27);
        System.out.println("preke1.getPavadinimas() = " + preke1.getPavadinimas());

        preke1.setKiekis(14);

        System.out.println("preke1 = " + preke1);
        System.out.println("preke1.getKaina() = " + preke1.getKaina());
        preke1.kainosKeitimasProcentais(20);
        System.out.println("preke1.getKaina() = " + preke1.getKaina());
        preke1.kainosKeitimasProcentais(-50);
        System.out.println("preke1.getKaina() = " + preke1.getKaina());

        int norimasKiekis1 = 50;
        int norimasKiekis2 = 3;
        System.out.println("preke1.arPakankamasLikutisSandelyje(norimasKiekis1) = " + preke1.arPakankamasLikutisSandelyje(norimasKiekis1));
        System.out.println("preke1.arPakankamasLikutisSandelyje(norimasKiekis2) = " + preke1.arPakankamasLikutisSandelyje(norimasKiekis2));
    }


}
