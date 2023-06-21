package uzduotis2;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Trikampis t1 = new Trikampis(6, 8, 10);
        Trikampis t2 = new Trikampis();
        t2.setA(6);
        t2.setB(8);
        t2.setC(10);
        System.out.println("t1.getB() = " + t1.getB());
        System.out.println("t2.getA() = " + t2.getA());
        System.out.println("t2.getC() = " + t2.getC());
    }
}
