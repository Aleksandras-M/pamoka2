package uzduotis2;

public class PagrindinePrograma {
    public static void main(String[] args) {

        Trikampis t1 = new Trikampis(1.23, 2.34, 3.45);
        Trikampis t2 = new Trikampis();
        t2.a = 4.56;
        t2.b = 5.67;
        t2.c = 6.78;
        t2.apskaiciuotiKampus();
        Trikampis t3 = new Trikampis(1, 2, 3);//blogas trikampis
        Trikampis t4 = new Trikampis(1, 2, 3, 45, 50, 75 ); //blogas trikampis
        Trikampis t5 = new Trikampis(5, 7, 9, 36.86989764584402,61.92751306420553, 81.20258928995008);

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        System.out.println("t4 = " + t4);
        System.out.println("t5 = " + t5);

        System.out.println("t1.perimetras() = " + t1.perimetras());
        System.out.println("t2.perimetras() = " + t2.perimetras());

        t1.sumazintKrastinesNKartu(3);
        t2.sumazintKrastinesNKartu(5);


        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);


        System.out.println("t1.plotasHeronoFormule() = " + t1.plotasHeronoFormule());
        System.out.println("t2.plotasHeronoFormule() = " + t2.plotasHeronoFormule());

        System.out.println("t1.didziausiaKrastine() = " + t1.didziausiaKrastine());
        System.out.println("t2.didziausiaKrastine() = " + t2.didziausiaKrastine());

    }
}
