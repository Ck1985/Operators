/**
 * Created by CK1985 on 4/11/2016.
 */
public class BitwiseOperators {
    public static void main(String[] args){
        int x = 2 + 8 + 32 + 128;
        int y = 1 + 4 + 16 + 64;

        System.out.println("Collection all Bitwise operators:");
        System.out.print("Present binary form of x is: " + Integer.toBinaryString(x));
        System.out.println();
        System.out.print("Present binary form of y is: " + Integer.toBinaryString(y));
        System.out.println();

        System.out.println("x & y = " + (x & y));
        System.out.println("x | y = " + (x | y));
        System.out.println("x ^ y = " + (x ^ y));
        System.out.println(" ~x = " + ~x);
        System.out.println(" ~y = " + ~y);
    }
}
