public class uzduotis10 {
    public static void main(String[] args) {
        System.out.println("kuriamKetvirtyje(1, 2) = " + kuriamKetvirtyje(1, 2));
        System.out.println("kuriamKetvirtyje(-5,-10) = " + kuriamKetvirtyje(-5,-10));
    }

    public static String kuriamKetvirtyje(int x, int y) {
        if (x == 0 && y == 0) {
            return "Origin";
        } else if (x > 0) {
            return y > 0 ? "1" : "4";
        } else {
            return y > 0 ? "2" : "3";
        }
    }
}
