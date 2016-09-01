package Misc;

/**
 * Created by edara on 5/16/16.
 */
public class VarEx1 {
    public static void main(String[] args) {
        char ch;
        String s1 = "abcd";
        String s2 = new String("abcd");
        String s3 = "xyz";
        if(s1.equals(s2)){
            ch ='H';
        }else if(s1.equals(s3)){
            ch ='E';
        }else {
            ch ='x';
        }
        System.out.println(ch);
        Short myShort = 8;
        short sShort = 9;
        Byte myByte = 10;
        //Byte bByte = 130;
        byte sByte = 11;

        byte by1 = 10;
        short sh1 = 12;
        byte by2 = (byte) (by1+sh1);

        int[] aa = new int[4];
        int[] ba = new int[5];
        aa = ba;

        //Double myDouble = 9;

    }
}
