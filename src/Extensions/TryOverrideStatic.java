package Extensions;

/**
 * Created by edara on 5/30/16.
 */
class TryOverrideStatic extends ClasswithStaticMethods{
    static String name = "Hareen";
    public static void main(String[] args) {
        TryOverrideStatic temp = new TryOverrideStatic();
        temp.sayHi();
        temp.sayHi(name);
        ClasswithStaticMethods temp2 = new ClasswithStaticMethods();
        temp2.sayHi();
    }
    // can not override static void sayHi. Below code don't compile.
    //void sayHi(){}
    static void sayHi(){
        System.out.println("Hello static extension");
    }
}

class ClasswithStaticMethods{
    static String name="Hari";
    static void sayHi(){
        System.out.println("Hello static");
    }
    static void sayHi(String name){
        System.out.println("Hello "+name);
    }
}
