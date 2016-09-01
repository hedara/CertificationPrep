package Exceptions;

/**
 * Created by edara on 4/29/16.
 */
public class Test4 extends A {

    Test4() throws Exception {
    }
    Test4(int i) throws Exception {

        System.out.println("one-arg constructor");
    }

    public static void main(String[] args) throws Exception {
        Test4 test4 = new Test4();
    }
}

class A{
    A() throws Exception {
        System.out.println("Alpha");
    }
}
