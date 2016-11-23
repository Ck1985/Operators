import java.util.Random;

/**
 * Created by CK1985 on 4/8/2016.
 */
public class CoinFlipping {
    public static void main(String[] args){
        Random ran = new Random();
        int coin = ran.nextInt();

        if(coin % 2 == 0){
            System.out.println("Head");
        }else{
            System.out.println("Tails");
        }
    }
}
