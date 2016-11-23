/**
 * Created by CK1985 on 4/7/2016.
 */
//Desmonstrator the mathematic operator
import java.util.*;
import static net.mindview.util.Print.*;
public class MathematicOperator {
    public static void main(String[] args){
        int i, j, k;
        Random ran = new Random(47);
        j = ran.nextInt(100) + 1;
        print("i = " + j);
        k = ran.nextInt(100) + 1;
        print("j = " + k);
        i = j + k;
        print("j + k = " + i);
        i = j - k;
        print("j - k = " + i);
        i = j * k;
        print("j * k = " + i);
        i = k / j;
        print("k / j = " + i);
        i = k % j;
        print("k % j = " + i);
        k %= j;
        print("k %= j" + k);

        float u, v, w;
        v = ran.nextFloat();
        print("v = " + v);
        w = ran.nextFloat();
        print("w = " + w);
        u = v + w;
        print("v + w = " + u);
        u = v - w;
        print("v - w = " + u);
        u = v * w;
        print("v * w = " + u);
        u = v / w;
        print("v / w = " + u);

        u += v;
        print(u);
        u -= v;
        print(u);
        u *= v;
        print(u);
        u /= v;
        print(u);
    }
}
