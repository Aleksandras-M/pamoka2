public class uzduotis1 {
    public static void main(String[] args) {
        System.out.println("arDalinasiIsAbiejuSkaiciu(25, 6, 5) = " + arDalinasiIsAbiejuSkaiciu(25, 6, 5));
        System.out.println("arDalinasiIsAbiejuSkaiciu(-100, 10, -20) = " + arDalinasiIsAbiejuSkaiciu(-100, 10, -20));
        System.out.println("arDalinasiIsAbiejuSkaiciu(140, 7, 2) = " + arDalinasiIsAbiejuSkaiciu(140, 7, 2));
        System.out.println("arDalinasiIsAbiejuSkaiciu(12, 4, 5) = " + arDalinasiIsAbiejuSkaiciu(12, 4, 5));
    }
    public static boolean arDalinasiIsAbiejuSkaiciu(int sk,int d1, int d2){
        if(d1 == 0 || d2 == 0){
            return false;
        }else { 
            return (sk % d1 == 0) && (sk % d2 == 0);
        }
    }
}
