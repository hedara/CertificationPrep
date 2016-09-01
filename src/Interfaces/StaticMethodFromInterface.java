package Interfaces;

/**
 * Created by edara on 5/26/16.
 */
public class StaticMethodFromInterface implements InterfaceWithStaticMethod {
    public static void main(String[] args) {
        StaticMethodFromInterface temp = new StaticMethodFromInterface();
        temp.sayHello();
        temp.sayHello("Hareen");
        InterfaceWithStaticMethod.sayHello();;
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello "+name);
    }
    void sayHello(){
        System.out.println("Hello World");
    }
}
