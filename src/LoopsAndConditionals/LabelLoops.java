// Hareen Edara
package LoopsAndConditionals;

/**
 * Created by edara on 5/16/16.
 */
public class LabelLoops {
    public static void main(String[] args) {
        int i =0,j=0;
       Loop1: for(int x=0;x<10;x++){
            Loop2: for(int y=0;y<10;y++){
                System.out.println("x:"+x+"y:"+y);
                if(y>1) continue Loop1;
                if(x>1) break Loop1;
            }
        }
    }
}
