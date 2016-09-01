package Misc;
import Extensions.*;

/**
 * Created by edara on 5/10/16.
 */
public class MiscClass {
    public static void main(String[] args) {
        int i = 0;
        i = i++;
        System.out.println(i);
        int a,b,c=20;
        a=b=10;
        int x=10,y=20;

        InitBlocks blocks = new InitBlocks();
        int var1 = 128;
        byte bvar = (byte) var1;
        System.out.println(bvar);
    }
}
