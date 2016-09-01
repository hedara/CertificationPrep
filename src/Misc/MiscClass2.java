package Misc;

/**
 * Created by edara on 5/12/16.
 */
public class MiscClass2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        if(s1.equals(s1 = s2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        boolean b1 = false;
        boolean b2 = false;
        if(b2 != b1 == b2){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
