/**
 * Created by CK1985 on 4/6/2016.
 */
// Assigment object is a bit trick
    import static net.mindview.util.Print.*;
class Tank{
    int level;
}
public class AssigmentObject {
    public static void main(String[] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank();

        t1.level = 9;
        t2.level = 12;

        print("t1.level = " + t1.level + "t2.level = " + t2.level);

        t1 = t2;
        print("t1.level = " + t1.level + "t2.level = " + t2.level);
        t1.level = 100;
        print("t1.level = " + t1.level + "t2.level = " + t2.level);
    }
}
