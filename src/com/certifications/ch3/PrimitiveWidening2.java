package com.certifications.ch3;

/**
 * Created by edara on 4/28/16.
 */
public class PrimitiveWidening2 {
    public static void method(byte b) {
        System.out.println("byte "+b);
    }
    public static void method(int i){
        System.out.println("integer "+i);
    }

    public static void main(String[] args) {
        byte b = 3;
        method(b);
        method(4);
        method(256);
        method((byte) 128);

    }
}
