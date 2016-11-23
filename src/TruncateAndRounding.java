/**
 * Created by CK1985 on 4/12/2016.
 */
public class TruncateAndRounding {
    public static void main(String[] args){
        double above = 0.6, below = 0.4;
        float fabove = 0.6f, fbelow = 0.4f;

        System.out.println("(int)above = " + (int)above);
        System.out.println("(int)below = " + (int)below);
        System.out.println("(int)fabove = " + (int)fabove);
        System.out.println("(int)fbelow = " + (int)fbelow);

        System.out.println("(round)above = " + java.lang.Math.round(above));
        System.out.println("(round)below = " + java.lang.Math.round(below));
        System.out.println("(round)fabove = " + java.lang.Math.round(fabove));
        System.out.println("(round)fbelow = " + Math.round(fbelow));

        float x = 19.6f;
        float y = 19.4f;
        System.out.println("(int)x = " + (int)x);
        System.out.println("(int)x = " + (int)y);

        System.out.println("(round)x = " + Math.round(x));
        System.out.println("(round)x = " + Math.round(y));
    }
}
