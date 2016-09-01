package MethodParams;

/**
 * Created by edara on 4/29/16.
 */
// Ambigous
public class Test1 {

    public static void main(String[] args) {
        method(null);
    }
    static void method(Object obj) {
        System.out.println("object");
    }
    static void method(Test1 test){
        System.out.println("Test1");
    }
  //  static void method(String str) {System.out.println("string");}

}
