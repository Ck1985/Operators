/**
 * Created by CK1985 on 4/11/2016.
 */
import java.util.*;
import static net.mindview.util.Print.*;
public class ShiftOperators {
    static void printBinaryInteger(String s, int i){
        print(s + " --- Integer: " + i + " --- Binary: " + Integer.toBinaryString(i));
    }
    static void printBinaryLong(String s, long i){
        print(s + " --- Long: " + i + " --- Binary: " + Long.toBinaryString(i));
    }
    public static void main(String[] args){
        printBinaryInteger("1", 1);
        printBinaryLong("-1", -1);

        Random ran = new Random(47);
        int x = ran.nextInt();
        int y = ran.nextInt();

        int maxValueInteger = Integer.MAX_VALUE;
        int minValueInteger = Integer.MIN_VALUE;

        printBinaryInteger("Max Value of Integer primitive type is: ", maxValueInteger);
        printBinaryInteger("Min Value of Integer primitive type is: ", minValueInteger);

        printBinaryInteger("x", x);
        printBinaryInteger("y", y);

        printBinaryInteger("x & y", (x & y));
        printBinaryInteger("x | y", (x | y));
        printBinaryInteger("x ^ y", (x ^ y));
        printBinaryInteger("~x", (~x));
        printBinaryInteger(" x >> 5", (x >> 5));
        printBinaryInteger(" x << 5", (x << 5));
        printBinaryInteger(" x >> 5", (x >> 5));
        printBinaryInteger(" (~x) >> 5", (~x >> 5));
        printBinaryInteger(" x >>> 5", (x >>> 5));
        printBinaryInteger(" ~x >>> 5", (~x >>> 5));
    }
}
