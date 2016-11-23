/**
 * Created by CK1985 on 4/8/2016.
 */
import static net.mindview.util.Print.*;

public class ShortCircuiting {
    static boolean testCompare1(int val){
        System.out.println("Test(" + val + ")");
        print("result: " + (val < 1));
        return val < 1;
    }
    static boolean testCompare2(int val){
        System.out.println("Test(" + val + ")");
        print("result: " + (val < 2));
        return val < 2;
    }
    static boolean testCompare3(int val){
        System.out.println("Test(" + val + ")");
        print("result: " + (val < 3));
        return val < 3;
    }
    public static void main(String[] args){
        boolean result = testCompare1(0) && testCompare2(2) && testCompare3(2);
        print(result);
    }
}
