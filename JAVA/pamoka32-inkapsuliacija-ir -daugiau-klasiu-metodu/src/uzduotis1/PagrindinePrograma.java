package uzduotis1;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Apskritimas a1 = new Apskritimas(12.2);
        Apskritimas a2 = new Apskritimas();
        a2.setSpindulys(25);
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
    }
}