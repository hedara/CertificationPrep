package Blocks;

/**
 * Created by edara on 6/1/16.
 */
public class InstanceBlockEx1 {
    final int fnum;
    static int snum = 12;
    int inum = 20;
    {
        snum = snum *inum/10;
        inum = inum/3;
        fnum =1;
    }
    public static void main(String[] args) {
        InstanceBlockEx1 ex1 = new InstanceBlockEx1();
        System.out.println(ex1.snum+"::"+ex1.inum);
    }
}
