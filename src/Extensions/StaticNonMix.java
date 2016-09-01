package Extensions;

/**
 * Created by edara on 5/26/16.
 */
public class StaticNonMix {
    static int num;
    int num2 = 2;
    final int num3;
    static final int num4;
    static{
        num4 =222;
    }
    public static void main(String[] args) {
        StaticNonMix temp = new StaticNonMix();
        System.out.println(num);

    }
    StaticNonMix(){
        num2 += num;
        num3 =111;
        sayHello();
        sayHello("Hareen");
    }
    static void sayHello(){
        System.out.println("Hello World");
    }
    void sayHello(String name){
        System.out.println("Hello "+name);
    }
    void sayHello(String name, int count) {
        System.out.println();
    }
}
