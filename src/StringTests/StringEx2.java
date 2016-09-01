package StringTests;

/**
 * Created by edara on 5/17/16.
 */
public class StringEx2 {
    public static void main(String[] args) {
        String name1 = "Hareen";
        String name2 = new String("Hareen");
        if(name1.intern() == name2.intern()){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
    }
}
