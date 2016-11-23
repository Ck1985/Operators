/**
 * Created by CK1985 on 4/6/2016.
 */
class Fruit{
    float weight;
    float dayUse;
}
public class TestFruit {
    public static void main(String[] args) {
        Fruit lemon = new Fruit();
        Fruit banana = new Fruit();

        lemon.weight = 25.8f;
        lemon.dayUse = 35.8f;

        banana.weight = 40f;
        banana.dayUse = 14.f;

        System.out.println("Lemon-Weight = " + lemon.weight + "Lemon-dayUse = " + lemon.dayUse);
        System.out.println("Banana-Weight = " + banana.weight + "Banana-dayUse = " + banana.dayUse);

        lemon.weight = banana.weight;
        System.out.println("Lemon-Weight = " + lemon.weight + "Lemon-dayUse = " + lemon.dayUse);
        System.out.println("Banana-Weight = " + banana.weight + "Banana-dayUse = " + banana.dayUse);

        lemon = banana;
        System.out.println("Lemon-Weight = " + lemon.weight + "Lemon-dayUse = " + lemon.dayUse);
        System.out.println("Banana-Weight = " + banana.weight + "Banana-dayUse = " + banana.dayUse);
    }
}
