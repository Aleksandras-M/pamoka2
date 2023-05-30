public class uzduotis7 {
    public static void main(String[] args) {
        System.out.println("arLygusSkaiciai(15.0247,18.956) = " + arLygusSkaiciai(15.0247,18.956));
        System.out.println("arLygusSkaiciai(12.0327,12.0358) = " + arLygusSkaiciai(12.0327,12.0358));
        System.out.println("arLygusSkaiciai(12.05847,12.05892) = " + arLygusSkaiciai(12.05847,12.05892));
    }

    public static boolean arLygusSkaiciai(double x, double y){
        return Math.round(x * 100d) / 100d == Math.round(y * 100d) / 100d;
    }
}
