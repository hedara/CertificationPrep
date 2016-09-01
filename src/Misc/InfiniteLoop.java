package Misc;

/**
 * Created by edara on 5/17/16.
 */
public class InfiniteLoop {
    public static void main(String[] args) {
        short s = 0;
        while(++s >0);
        System.out.println("done :"+s);
    }
}
