package Interfaces;

/**
 * Created by edara on 5/28/16.
 */

interface ISameMethodInterface{
    int num =10;
    default void sayHi(){
        System.out.println("Hello I1");
    }
    void sayHi(String name);
}
interface ISameMethodInterface2 extends ISameMethodInterface {
    int num = 20;
    default void sayHi(){
        System.out.println("Hello I2");
    }
    void sayHi(String name);
}

class SameMethodClass implements  ISameMethodInterface,ISameMethodInterface2 {
    public void sayHi(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        ISameMethodInterface temp = new SameMethodClass();
        ISameMethodInterface2 temp2 = new SameMethodClass();
        SameMethodClass temp3 = new SameMethodClass();
        temp.sayHi();
        temp2.sayHi();
        System.out.println(temp.num);
        System.out.println(((ISameMethodInterface2)temp).num);
        //System.out.println(temp3.num);
        int a = 'a';
        char c = 9;
        int a1 = 10;
        double d1 = 10.0;
        if(a1 == d1) System.out.println("equals");
    }
}