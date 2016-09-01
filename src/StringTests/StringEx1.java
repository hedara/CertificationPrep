package StringTests;

/**
 * Created by edara on 5/14/16.
 */
public class StringEx1 {
    public static void main(String[] args) {
        String name ="Hareen ";
        name = name.trim();
        if(name == "Hareen"){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        final String LNAME = "EDARA";
        String lname  = " Edara ";
        lname = lname.trim().toUpperCase();
        if(lname.intern() == LNAME){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        System.out.println(name.substring(0,4));
        String name1 = "Hareen";
        String name2 = new String("Hareen");
        if(name1 == name2){
            System.out.println("same");
        }
    }
}
