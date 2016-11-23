/**
 * Created by CK1985 on 4/13/2016.
 */
public class StringCompare {
    /*static boolean f(boolean b){
        if(b == true){
            return true;
        }else{
            return false;
        }
    }*/

    static void f(boolean b){
        if(b == true){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    static void StringTest(String s, String p){
        f(s == p);
        f(s != p);
        f(s.equals(p));
        f(p.equals(s));
        //!f(!s);
        //!f(!p);
        //!f(s && p);
        //!f(s || p);
        //!f(s & p);
        //!f(s | p);
        //!f(s ^ p);
        //f(~s);
    }

    public static void main(String[] args){
        StringTest("Cun", "Cun1");
    }
}
