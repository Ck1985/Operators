/**
 * Created by CK1985 on 4/7/2016.
 */
class Velocity{
    static double CalculatorMethod(double distance, double time) {
        if(time == 0){
            return 0;
        }else if(time < 0){
            return -1;
        }else{
            return distance / time;
        }
    }
}
public class CalculatorVelocity {
    public static void main(String[] args){
        double distance = 100.7;
        double time = -4.9;
        double velocity = Velocity.CalculatorMethod(distance, time);
        if(velocity == -1){
            System.out.println("Sorry, time is invalid");
        }else{
            System.out.println(velocity);
        }
    }
}
