package Misc;

/**
 * Created by edara on 5/16/16.
 */
public class FinalEx1 extends Alpha {
    public static void main(String[] args) {
        FinalEx1 ex = new FinalEx1();
        StringBuilder sb = ex.getSb();
        sb = new StringBuilder();
        sb.append("hello");
        System.out.println(sb.toString());

        final StringBuilder sb2 = ex.getSb();
        // below line doesn't work.
        //sb2 = new StringBuilder();

    }
}
class Alpha {
    private final StringBuilder sb = new StringBuilder();

    StringBuilder getSb() {
        return sb;
    }
}
