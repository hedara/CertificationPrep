package OverRidingNOverLoading;

/**
 * Created by edara on 5/3/16.
 */
public class OverRidingEx1 extends Parent {
//    public static void demo(){
//        System.out.println("child");
//    }
    public static void demo(String name){
        System.out.println("child "+name);
    }

    public static void main(String[] args) {
        demo();
        demo("eh");

    }

}

class Parent {
    protected static void demo() {
        System.out.println("parent");
    }
}