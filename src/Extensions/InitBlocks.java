package Extensions;

/**
 * Created by edara on 5/25/16.
 */
public class InitBlocks {
    public static void main(String[] args) {
        Beta1 b = new Beta1();

    }
    public InitBlocks(){

    }
}

class Alpha1{
    static int a = 10;
    int b,c;
    static {
        a = 20;
        System.out.println(a);
        //throw new Exception();
    }
    {
        b = 30;
        System.out.println(b);
    }
    Alpha1(){
        c = 40;
        System.out.println(c);
    }
}
class Beta1 extends Alpha1{
    static int x = 15;
    int y,z;
    static {
        //x = 25;
        System.out.println(x);
    }
    {
        y = 35;
        System.out.println(y);
    }
    Beta1(){
        z = 45;
        System.out.println(z);
    }
}