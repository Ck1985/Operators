/**
 * Created by CK1985 on 4/12/2016.
 */
//Test all operators on all the primitive data type
// to show which one accepted by java compiler.
import static net.mindview.util.Print.*;
public class AllOperators {
    void f(boolean b){}
    void boolTest(boolean x, boolean y){
        //Arithmetic operators
        //!x = x * y;
        //!x = x / y;
        //!x = x % y;
        //!x = x + y;
        //!x = x - y;

        //Relation and logical operators
        //!f(x > y);
        //!f(x < y);
        //!f(x >= y);
        //!f(x <= y);
        f(x == y);
        f(x != y);
        f(!y);
        x = x && y;
        x = x || y;
        //Bitwise and Shift Operators
        x = x & y;
        x = x | y;
        x = x ^ y;
        //!x = ~y;
        //!x = x >> 5;
        //!x = x << 5;
        //!x = x >>> 5;
        //Compound assigment
        //!x += y;
        //!x -= y;
        //!x *= y;
        //!x /= y;
        //!x %= y;
        x &= y;
        x |= y;
        x ^= y;
        //Casting
        //!char c = (char)x;
        //!byte b = (byte)x;
        //!short s = (short)x;
        //!long l = (long)x;
        //!int i = (int)x ;
        //!double d = (double)x;
        //!float f = (float)x;
    }

    //Char Test
    void charTest(char x, char y){
        //Arithmetic Operators
        x = (char)(x * y);
        x = (char)(x / y);
        x = (char)(x + y);
        x = (char)(x - y);
        x = (char)(x % y);
        x++;
        x--;
        x = (char)+y;
        x = (char)-y;

        //Relation and logical
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //!f(x && y);
        //!f(x || y);
        //!f(!x);

        //Bitwise operators
        x = (char)(x & y);
        x = (char)(x | y);
        x = (char)(x ^ y);
        x = (char)(~x);
        x = (char)(x >>5);
        x = (char)(x << 5);
        x = (char)(x >>> 5);

        //Compound Assignment
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x &= y;
        x |= y;
        x ^= y;

        //Casting:
        //!boolean bl = (boolean)x;
        byte b = (byte)x;
        short s = (short)x;
        int i = (int)x;
        long l = (long)x;
        double d = (double)x;
        float f = (float)x;
    }

    void byteTest(byte x, byte y){
        //Arithmetic operators
        x = (byte)(x + y);
        x = (byte)(x - y);
        x = (byte)(x * y);
        x = (byte)(x / y);
        x = (byte)(x % y);
        x++;
        x--;
        x = (byte)+y;
        x = (byte)-y;

        //Relation anf logical
        f(x > y);
        f(x < y);
        f(x >= y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //!f(x && y);
        //!f(x || y);
        //!f(!x);

        //Bitwise operators
        x = (byte)(~y);
        x = (byte)(x & y);
        x = (byte)(x | y);
        x = (byte)(x ^ y);
        x = (byte)(x << 5);
        x = (byte)(x >> 5);
        x = (byte)(x >>> 5);

        //Compound operators
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x &= y;
        x |= y;
        x ^= y;
        x >>= y;
        x <<= y;
        x >>>= y;

        //Casting
        //!boolean b = (boolean)(x);
        char c = (char)(x);
        short s = (short)(x);
        int i = (int)(x);
        long l = (long)(x);
        double d = (double)(x);
        float f = (float)(x);
    }

    void shortTest(short x, short y){
        //Arithmetic operators
        x = (short)(x + y);
        x = (short)(x - y);
        x = (short)(x * y);
        x = (short)(x / y);
        x = (short)(x % y);
        x++;
        x--;
        x = (short)(+y);
        x = (short)(-y);

        //Relation and logical
        f(x > y);
        f(x < y);
        f(x >= y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //!f(x && y);
        //!f(x || y);
        //!f(!x);

        //Bitwise Operators
        x = (short)(x & y);
        x = (short)(x | y);
        x = (short)(x ^ y);
        x = (short)(~y);
        x = (short)(x >> 5);
        x = (short)(x << 5);
        x = (short)(x >>> 5);

        //Compound operators
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x &= y;
        x |= y;
        x ^= y;

        //Casting:
        //!boolean b = (boolean)(x);
        char c = (char)x;
        byte b = (byte)x;
        int  i = (int)x;
        long l = (long)x;
        float f = (float)x;
        double d = (double)x;
    }

    void intTest(int x, int y){
        //Arithmetic operators

    }

    public static void main(String[] args){
        byte x = 16, y = 20;
        x = (byte)+y;
        print(x);
    }
}
