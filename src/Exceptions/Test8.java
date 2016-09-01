package Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by edara on 5/26/16.
 */
public class Test8 {
    public static void main(String[] args) {
        try{
            callMethod();
        }catch(ParseException|IOException ex){
            System.out.println(ex);
        }

    }
    static void callMethod() throws IOException,ParseException {
        int i =0;
        if(i >0)
            throw new ParseException("throwing ParseException",0);
        else
            throw new IOException("throwing IOException");
    }
}
