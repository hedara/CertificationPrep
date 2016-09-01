package OverRidingNOverLoading;

/**
 * Created by edara on 5/16/16.
 */
public class OverRidingFinal extends Alpha {
    public static void main(String[] args) {
        OverRidingFinal ex = new OverRidingFinal();

    }
    // can not override final
//    void getName(){
//        System.out.println("Hello extension");
//    }

}

class Alpha {
    final void getName(){
        System.out.println("Hello you");
    }
}
