package Exceptions;

import java.io.IOException;

/**
 * Created by edara on 4/29/16.
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        System.out.println(method());
    }
    static int method() throws IOException {
        try{
            throw new Exception();

        }catch(Exception ex) {
            return 2;
        }finally {
            throw new IOException();
        }
    }
}
