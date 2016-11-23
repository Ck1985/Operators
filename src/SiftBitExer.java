/**
 * Created by CK1985 on 4/12/2016.
 */
public class SiftBitExer {
    public static void displayCharBinary(char c){
        System.out.println(Integer.toBinaryString(c));
    }
    public static void main(String[] args){
        int hexVal = 0x2D1E; // 10110100011110
        int lengthBinary = Integer.toBinaryString(hexVal).length();

        for(int i = 0; i < lengthBinary; i++){
            //hexVal = hexVal >> 1;
            hexVal >>= 1;
            //System.out.println(Integer.toBinaryString(hexVal));

        }
        int x = 0x3FF;
        int length1 = Integer.toBinaryString(x).length();
        for(int i = 0; i < length1; i++){
            x <<= 1;
            x >>>= 2;
           // System.out.println(Integer.toBinaryString(x));
            displayCharBinary('h');
        }
    }
}
