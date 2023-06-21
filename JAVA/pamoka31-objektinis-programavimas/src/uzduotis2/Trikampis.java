package uzduotis2;

public class Trikampis {
    double a;
    double b;
    double c;
    double ab;
    double bc;
    double ca;

    public Trikampis(double a, double b, double c) {
        if (arSusidaroTrikampis(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
            apskaiciuotiKampus();
        } else {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.ab = 0;
            this.bc = 0;
            this.ca = 0;
        }




    }
    public Trikampis(double a, double b, double c, double ab, double bc, double ca) {
        if (arSusidaroTrikampis(a, b, c) && arTeisingiKampai(ab, bc, ca)) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.ab = ab;
            this.bc = bc;
            this.ca = ca;
        } else {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.ab = 0;
            this.bc = 0;
            this.ca = 0;
        }
    }

    public Trikampis() {

    }

    @Override
    public String toString() {
        return "Trikampis{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", ab=" + ab +
                ", bc=" + bc +
                ", ca=" + ca +
                '}';
    }

    public double perimetras() {
        return a + b + c;
    }

    public void sumazintKrastinesNKartu(int x) {
        a /= x;
        b /= x;
        c /= x;
        apskaiciuotiKampus();
    }

    public double plotasHeronoFormule() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

    public String didziausiaKrastine() {
        if (a > b && a > c) {
            return "a";
        } else if (b > a && b > c) {
            return "b";
        } else if (c > a && c > b) {
            return "c";
        } else {
            return null;
        }
    }

    public static boolean arSusidaroTrikampis(double a, double b, double c) {
        return a < b + c && b < a + c && c < b + a;
    }

    public void apskaiciuotiKampus() {
        ab = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2.0 * b * c)));
        bc = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2.0 * a * c)));
        ca = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2.0 * a * b)));
    }

    private boolean arTeisingiKampai(double ab, double bc, double ca) {
        return Math.abs(ab + bc + ca - 180.0) <= 1e-10;
    }
}
