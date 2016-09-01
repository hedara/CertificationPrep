package OverRidingNOverLoading;

/**
 * Created by edara on 5/25/16.
 */
public class OverLoadingEx1 {
    public static void main(String[] args) {
        sayHello();
        sayHello("Hareen");
    }

    final static void sayHello(){
        System.out.println("Hello");
    }
    final static void sayHello(String name){
        System.out.println("Hello "+name);
    }
}
