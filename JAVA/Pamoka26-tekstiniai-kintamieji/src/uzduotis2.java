public class uzduotis2 {
    public static void main(String[] args) {
        String zodis1 = "ananasas";
        String zodis2 = "Sakinys.";
        String zodis3 = "meška";

        System.out.println("paskutineRaide(zodis1) = " + paskutineRaide(zodis1));
        System.out.println("paskutineRaide(zodis2) = " + paskutineRaide(zodis2));
        System.out.println("paskutineRaide(zodis3) = " + paskutineRaide(zodis3));
    }

    public static char paskutineRaide(String zodis){
        return zodis.charAt(zodis.length() - 1);
    }
}
