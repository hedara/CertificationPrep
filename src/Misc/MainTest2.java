package Misc;

/**
 * Created by edara on 5/28/16.
 */
class MainTest2 {
    int num = 10;
}
class A2 { }
class B2 extends A2 {
    public static void main(String args[]){
        System.out.println(new MainTest2().num);
    }
}