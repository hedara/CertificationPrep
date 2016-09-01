package Threads;

/**
 * Created by edara on 5/10/16.
 */
public class ThreadEx2 extends Thread{
    public static void main(String[] args) {
        ThreadEx2 ex2 = new ThreadEx2();
        ex2.start();
    }
    public void run() {
        System.out.println("starting new thread");
    }

}
