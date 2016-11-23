/**
 * Created by CK1985 on 4/10/2016.
 */
import static net.mindview.util.Print.*;
public class Literals {
    public static void main(String[] args){
        int i1 = 0x2f;
        print(i1);
        int i2 = 0x2F;
        print("i2 = " + Integer.toBinaryString(i2));
        int i3 = 0x4d8f;
        print("i3 = " + Integer.toBinaryString(i3));
        print("i3 = " + Integer.toHexString(i3));
        print("i3 = " + Integer.toString(i3));
        int i4 = 06231;
        print("i4 = " + Integer.toBinaryString(i4));
        print("i4 = " + Integer.toHexString(i4));
        print("i4 = " + Integer.toOctalString(i4));
        print("i4 = " + Integer.toString(i4));
        char c = 0xffff;
        print("c = " + Integer.toBinaryString(c));
        byte b = 0x7f;
        print("b = " + Integer.toBinaryString(b));
        short sh = 0x7fff;
        print("sh = " + Integer.toBinaryString(sh));
        long n1 = 200L;
        long n2 = 200l;
        long n3 = 200;
        float f1 = 1;
        float f2 = 1F;
        float f3 = 1f;
        double d1 = 70.5;
        double d2 = 70.5D;
        double d3 = 70.5d;

        long n4 = 0xA7E2L;
        long n5 = 0512l;
        print("n4 = " + Long.toBinaryString(n4));
        print("n5 = " + Long.toBinaryString(n5));
    }
}
