/**
 * Created by CK1985 on 4/7/2016.
 */
import static net.mindview.util.Print.*;
public class AutoIncrementAndDecrement {
    public static void main(String[] args){
        int i = 1;
        print("i = " + i);          //1
        print("++i = " + ++i);      //2
        print("i++ = " + i++);      //2
        print("i = " + i);          //3
        print("--i = " + --i);      //2
        print("i-- = " + i--);      //2
        print("i = " + i);          //1

        int k = 5, t = 10;
        int result;
        result = k++;    //Thuc hien phep tinh gan cho result truoc roi sau do moi tang k len 1 do do result = 5
        print(result);   //5

        result = ++t;     //Thuc hien phep tang t len 1 truoc roi sau do moi thuc hien phep tinnh gan result cho t do do result = 11;
        print(result);    //11
    }
}
