package ArraySamples;

/**
 * Created by edara on 5/17/16.
 */
public class ArrayEx1 {
    public static void main(String[] args) {
        Alpha[] a = new Alpha[10];
        Beta[] b = new Beta[20];
        a = b;
    }


}
class Alpha {}
class Beta extends Alpha {}