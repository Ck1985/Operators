/**
 * Created by CK1985 on 4/8/2016.
 */
import java.util.*;
import static net.mindview.util.Print.*;

public class Bool {
    public static void main(String[] args){
        int x, y;
        Random ran = new Random(100);
        x = ran.nextInt(100);
        y = ran.nextInt(100);

        print("x = " + x + " and y = " + y);
        print("x == y ---- " + (x == y));
        print("x > y ---- " + (x > y));
        print("x < y ---- " + (x < y));
        print("x >= y ---- " + (x >= y));
        print("x <= y ---- " + (x <= y));
        print("x != y ---- " + (x != y));

        print("(x > 10) && (y > 10) ---- " + ((x > 10) && (y > 10)));
        print("(x < 10) && (y < 10) ---- " + ((x < 10) && (y < 10)));
        print("(x > 10) && (y < 10) ---- " + ((x > 10) && (y < 10)));
        print("(x > 10) && (y > 10) ---- " + ((x > 10) || (y > 10)));
        print("(x < 10) && (y < 10) ---- " + ((x < 10) || (y < 10)));
        print("(x > 10) && (y < 10) ---- " + ((x > 10) || (y < 10)));

        print(" 5 / 2 = " +(5 / 2));
    }
}
