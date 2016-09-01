package Extensions;

/**
 * Created by edara on 4/30/16.
 */
public class Test1 extends Horse{
    public static void main(String[] args) {
        Test1 test = new Test1();
        System.out.println(test.val);
    }

}
class Animal {
    final int val = 2;

}
class Horse extends Animal {

}