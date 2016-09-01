package com.certifications.ch3;

/**
 * Created by edara on 4/17/16.
 */
public class WideningBoxingEx1 {

    public static void main(String[] args) {
        int inum = 200;
        Object inter = (Object) Integer.valueOf(inum);
        short snum = ((Short) inter).shortValue();
        System.out.println(snum);
        System.out.println("done");

    }
}
