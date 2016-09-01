package OverRidingNOverLoading;

/**
 * Created by edara on 5/17/16.
 */
public class OverridingEx4 {
    public static void main(String[] args) {
        C1 c = new C1();
        System.out.println(c.getVal());
        System.out.println(c.getSuperVal());

    }
}
class A1 {
    int val = 10;
    int getVal(){return val;}
}
class B1 extends A1 {
    int val = 20;
    int getVal(){return val;}
    int getSuperVal(){return super.val;}
}
class C1 extends B1 {
    int val = 30;
    int getVal(){return val;}
    int getSuperVal() {return super.val;}
}
