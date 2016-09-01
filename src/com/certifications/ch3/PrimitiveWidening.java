package com.certifications.ch3;

/**
 * Created by edara on 4/28/16.
 */
public class PrimitiveWidening {

    public static void method(float f){
        System.out.println("float");
    }
    public static void method(double d) {
        System.out.println("double");

    }

    public static void main(String[] args) {
        float f1 = 10.0f;
        float f2 = (float) 11.0;
        method(f1+f2);
        method(10.0f *20.0f);
        method(10.1 * 20f);
    }

}
