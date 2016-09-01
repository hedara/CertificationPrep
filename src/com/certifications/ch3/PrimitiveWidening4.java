package com.certifications.ch3;

/**
 * Created by edara on 4/28/16.
 */
public class PrimitiveWidening4 {
    public static void main(String[] args) {
        method(new String("Hello"));
    }
    public static void method(String s) {
        System.out.println(" String ");
    }
    public static void method(StringBuffer sb){
        System.out.println(" StringBuffer ");
    }
}
