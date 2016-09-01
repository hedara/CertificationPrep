package Interfaces;

/**
 * Created by edara on 4/29/16.
 */
public class Test1 implements I{
    int j = 1;  // shadowing variable
    public static void main(String[] args) {
        Test1 test = new Test1();
        System.out.println(test.j);
        I test2 = new Test1();
        System.out.println(test2.j);
        System.out.println(I.j);

    }
}
interface I{
    int j = 3;
}
