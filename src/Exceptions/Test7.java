package Exceptions;

/**
 * Created by edara on 5/26/16.
 */
public class Test7 {
    public static void main(String[] args) {
        try{
            callMethod();
        }catch(Exception ex){
            System.out.println("General Exception");
       //}catch(NullPointerException ex) {
       //     System.out.println("Null pointer Exception");
        }
    }

    static void callMethod() throws NullPointerException {
        throw new NullPointerException();
    }
}
