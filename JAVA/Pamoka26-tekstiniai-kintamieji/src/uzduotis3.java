public class uzduotis3 {
    public static void main(String[] args) {
        String z1 = "Antanas";
        String z2 = "ropė";
        String z3 = "kelmas";
        String z4 = "skruzdėlynas";
        String z5 = "mašina";
        String z6 = "metras";

        System.out.println("kuris ilgesnis naudojant funkcija lyginant ilgius");
        System.out.println("(z1, z2) = " + kurisZodisIlgesnis(z1, z2));
        System.out.println("(z3, z4) = " + kurisZodisIlgesnis(z3, z4));
        System.out.println("(z5, z6) = " + kurisZodisIlgesnis(z5, z6));


        System.out.println("kuris ilgesnis naudojant funkcija kuri lygina du skaicius");
        System.out.println("(z1, z2) = " + kurisSkaiciusDidesnis(z1.length(), z2.length()));
        System.out.println("(z3, z4) = " + kurisSkaiciusDidesnis(z3.length(), z4.length()));
        System.out.println("(z5, z6) = " + kurisSkaiciusDidesnis(z5.length(), z6.length()));
    }

    public static int kurisZodisIlgesnis(String z1, String z2) {
        return Integer.compare(z1.length(), z2.length());
    }
public static int kurisSkaiciusDidesnis(int x, int y){
        return  Integer.compare(x, y);
}
}
