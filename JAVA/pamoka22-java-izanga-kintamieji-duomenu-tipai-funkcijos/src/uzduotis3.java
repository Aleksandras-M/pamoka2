import java.util.Arrays;

public class uzduotis3 {
    public static void main(String[] args) {
        float a1 = 17.35f;
        float b1 = 18f;
        float c1 = 20.47f;
        float d1 = 16.37f;
        System.out.println("namoPerimetras = " + namoPerimetras(a1, b1, c1, d1));
        float a2 = 2f;
        float b2 = 4f;
        float c2 = 2f;
        float d2 = 4.1f;
        System.out.println("namoPerimetras = " + namoPerimetras(a2, b2, c2, d2));
    }


    public static float namoPerimetras(float a, float b, float c, float d) {
        return a + b + c + d;
    }
}


