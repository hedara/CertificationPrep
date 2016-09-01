package Interfaces;

/**
 * Created by edara on 5/26/16.
 */
public interface InterfaceWithStaticMethod {

    static void sayHello(){
        System.out.println("Hello World");
    }
    void sayHello(String name);
}
