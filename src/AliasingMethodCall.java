/**
 * Created by CK1985 on 4/6/2016.
 */
import static net.mindview.util.Print.*;
import java.util.*;
class Person{
    String name;
    float weight;
}
public class AliasingMethodCall {
    public static void PassValueMethod(int value){
        value = 999;
    }
    public static void PassReferenceMethod(Person p){
        p.name = "Anonymous";
        p.weight = 57.8f;
    }
    public static void main(String[] args){
        int value = 50;
        print("Before pass value to Method:");
        print(value);
        PassValueMethod(value);
        print("After pass value to Method:");
        print(value);

        Person per = new Person();
        print("Before pass object to Method");
        print("p.name = " + per.name + " p.weight = " + per.weight);

        PassReferenceMethod(per);
        print("After pass object to Method");
        print("p.name = " + per.name + " p.weight = " + per.weight);

    }
}
