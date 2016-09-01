package Threads;

/**
 * Created by edara on 5/3/16.
 */
public class ThreadEx1 extends Thread {
    public ThreadEx1(){
        super(new Runnable(){
            @Override
            public void run() {

            }
        });
    }
    public void run() {
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        ThreadEx1 t1 = new ThreadEx1();
        ThreadEx1 t2 = new ThreadEx1();
        t1.start();t2.start();

    }
}
