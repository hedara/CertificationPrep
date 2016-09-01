package Exceptions;

/**
 * Created by edara on 5/4/16.
 */
public class Test5 {
    public static void main(String[] args) {
        try {
            throwExceptionMethod();
        }catch(IllegalAccessException ex){
            System.out.println(ex);
        }catch(Exception ex) {
            System.out.println(ex);
        }
    }
    static void throwExceptionMethod() throws Exception{
        throw new IllegalAccessException("hello");
    }
}
