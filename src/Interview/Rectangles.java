package Interview;

/**
 * Created by edara on 6/27/16.
 */
public class Rectangles {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,15,10,5);
        Rectangle r2 = new Rectangle(15,5,3,12);
        Rectangle result = new Rectangle();

        result.x = getLarge(r1.x,r2.x);
        result.y = getLarge(r1.y,r2.y);
        result.w = getSmall((r1.x+r1.w),(r2.x+r2.w))-result.x;
        result.h = getSmall((r1.y+r1.h),(r2.y+r2.h))-result.y;

        System.out.println("new rectangle (x,y)" +"("+result.x+","+result.y+")");
        if(result.w <=0 || result.h <=0){
            System.out.println("both rectangles don't intersect");
        }else {
            System.out.println("Width:" + result.w);
            System.out.println("Height:" + result.h);
        }
    }

    static int getSmall(int i1,int i2){
        return i1<i2? i1 : i2;
    }
    static int getLarge(int i1,int i2){
        return i1>i2?i1:i2;
    }

}
