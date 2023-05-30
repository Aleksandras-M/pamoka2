public class uzduotis11 {
    public static void main(String[] args) {
        System.out.println("grazintiNeigiama(-5) = " + grazintiNeigiama(-5));
        System.out.println("grazintiNeigiama(25) = " + grazintiNeigiama(25));
        System.out.println("grazintiNeigiama(0) = " + grazintiNeigiama(0));
    }

    public static int grazintiNeigiama(int x){
        if(x == 0)
            return 0;
        else if (x > 0)
            return x * -1;
        else 
            return x;
    }
}
