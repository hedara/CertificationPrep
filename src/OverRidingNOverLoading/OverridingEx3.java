package OverRidingNOverLoading;

/**
 * Created by edara on 5/11/16.
 */
public class OverridingEx3 {
    public static void main(String[] args) {
        A a1 = new C();
        B b1 = (B) a1;
        System.out.println(a1.getNum());
        System.out.println(b1.getNum());
        System.out.println(a1.i);
        System.out.println(b1.i);
    }
}

class A {
    int i = 10;
    int getNum(){
        return i;
    }
}
class B extends A{
    int i = 20;
    int getNum(){
        return i;
    }
}
class C extends B {
    int i = 30;
    int getNum(){
        return i;
    }
}