//Funkcija gauna sveiką skaičių, ir išveda "didelis neigiamas", jeigu yra mažiau -1 000 000, "neigiamas" jeigu tarp 0 ir -1 000 000, "nulis", jeigu nulis, "teigiamas" jeigu nuo 0 iki 1 000 000, "didelis teigiamas", jeigu daugiau nei 1 000 000

public class uzduotis8 {
    public static void main(String[] args) {
        System.out.println("koksYraSkaicius(-5000000) = " + koksYraSkaicius1(-5000000));
        System.out.println("koksYraSkaicius(0) = " + koksYraSkaicius1(0));
        System.out.println("koksYraSkaicius(8500000) = " + koksYraSkaicius1(8500000));
        System.out.println("koksYraSkaicius(85) = " + koksYraSkaicius1(85));
        System.out.println("koksYraSkaicius(-5) = " + koksYraSkaicius1(-5));

    }
    
    public static String koksYraSkaicius1(int x){
        if(x < 0){
            if (x < -1000000){
                return "didelis neigimas";
            }else{
                return "neigiamas";
            }
        }else if(x > 0){
            if(x > 1000000){
                return "didelis teigiamas";
            }else {
                return "teigiamas";
            }
        }
        return "nulis";

    }

    public static String koksYraSkaicius2(int x){
        if(x < 0){
            return x < -1000000 ? "didelis neigiamas" : "neigiamas";
        }else if(x > 0){
            return x > 1000000 ? "didelis teigiamas" : "teigiamas";
        }
        return "nulis";
    }
}
