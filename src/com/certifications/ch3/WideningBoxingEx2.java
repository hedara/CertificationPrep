package com.certifications.ch3;

/**
 * Created by edara on 4/26/16.
 */
public class WideningBoxingEx2 {

    public static void main(String[] args) {
        int num1 = 8;
        long num2 = num1; //widening
        double num3 = num1;  //widening
        Integer num11 = num1; //boxing
        //Double num12 = num1; //boxing and widening can't happen

        Integer num21 = new Integer(5);
        Object obj1 = num21;

        // widening can happen only to primitives
        // widening can happen to wrapper class to Object


    }
}
