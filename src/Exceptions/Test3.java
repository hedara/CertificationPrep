package Exceptions;

/**
 * Created by edara on 4/29/16.
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(method());
    }
    static int method() {
        try{
            throw new Exception();

        }catch(Exception ex) {
            throw new Exception();
        }finally {
            return 3;
        }
    }
}
