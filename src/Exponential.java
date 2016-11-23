/**
 * Created by CK1985 on 4/10/2016.
 */
public class Exponential {
    public static void main(String[] args){
        float expFloat = 1.39E-43F;
        expFloat = 1.39e-43f;
        System.out.println(expFloat);
        double d1 = 47e47d;
        System.out.println(d1);
        float f1 = 1e-43f;

        float f_max = Float.MAX_EXPONENT;
        double d_max = Double.MAX_EXPONENT;
        d_max = Double.MIN_VALUE;
        System.out.println("f_max = "+ f_max);
        System.out.println("d_max = " + d_max);
    }
}
