package Misc;

/**
 * Created by edara on 5/13/16.
 */
public class MiscClass3 {
    int i = getJ();
    int j = 20;
    public static void main(String[] args) {
        MiscClass3 temp = new MiscClass3();
        System.out.println(temp.i);
        if("hareen".equals (" hareen".trim())){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        String name1 = "HAREEN";
        String name2 = "HAREEN";
        if("HAREEN".toUpperCase() == "HAREEN"){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        final int a = 10;
        byte b =  a;

    }
    void sayHello(String name){
        System.out.println("Hello "+name);
    }
    int getJ(){
        return j;
    }

}
