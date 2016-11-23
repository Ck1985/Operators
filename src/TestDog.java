/**
 * Created by CK1985 on 4/7/2016.
 */
import java.lang.*;
class Dog{
    String name;
    String says;

    Dog(String name, String says){
        this.name = name;
        this.says = says;
    }
}
public class TestDog {
    public static void main(String[] args){
        Dog dog1 = new Dog("spot", "ruff!");
        Dog dog2 = new Dog("scruffy", "wurff");

        System.out.println("The first dog has name is: " + dog1.name + "and it says: " + dog1.says);
        System.out.println("The second dog has name is: " + dog2.name + "and it says: " + dog2.says);

        Dog dog3 = new Dog("spot", "ruff!");
        System.out.println("Compare by == ");
        System.out.println("dog1 == dog3 " + (dog1 == dog3));
        System.out.println("Compare by equals() ");
        System.out.println("dog1.equals(dog3) " + dog1.equals(dog3));
        System.out.println("dog3.equals(dog1) " + dog3.equals(dog1));

        dog1 = dog3;
        System.out.println("Compare by == ");
        System.out.println("dog1 == dog3 " + (dog1 == dog3));
        System.out.println("Compare by equals() ");
        System.out.println("dog1.equals(dog3) " + dog1.equals(dog3));
        System.out.println("dog3.equals(dog1) " + dog3.equals(dog1));

    }
}
