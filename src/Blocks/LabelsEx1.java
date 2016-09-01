package Blocks;

import Misc.FinalEx1;

/**
 * Created by edara on 6/1/16.
 */
public class LabelsEx1 extends FinalEx1 {
    public static void main(String[] args) {

        label1 :
        {
            int num = 0;
            label2:
            while (num < 8) {
                if (++num % 2 == 0)
                    break label1;
                System.out.println(num);
            }
            System.out.println("outside while :"+num);
        }
        System.out.println("outside label1");
    }
}
