package OverRidingNOverLoading;

/**
 * Created by edara on 5/4/16.
 */
public class OverRidingEx2 {
    public static void main(String[] args) throws Exception {
        Vehicle v = new Car();
        v.drive();
        v.turn("Right");
        v.stop();

        System.out.println("Number of wheels:"+v.numOfWheels);
        System.out.println("Is Vehicle Moveable:"+v.isMoveable());
    }
}

class Vehicle{
    public int numOfWheels;
    public final boolean moveable = true;

    protected boolean drive() throws Exception {
        System.out.println("Driving Vehicle");
        return true;
    }
    protected boolean stop(){
        System.out.println("Stopping Vehicle");
        return true;
    }
    protected String turn(String side){
        System.out.println("Turning Vehicle :"+side);
        return side;
    }
    protected boolean isMoveable(){
        return moveable;
    }
}
class Car extends Vehicle {
    public int numOfWheels=4;

    protected boolean drive() throws EngineProblemException {
        System.out.println("Driving Car");
        return true;
    }
    protected boolean stop(){
        System.out.println("Stopping Car");
        return true;
    }
    protected String turn(String side){
        System.out.println("Turning Car :"+side);
        return side;
    }
    public boolean isMoveable(){
        return moveable;
    }


}

class EngineProblemException extends Exception{

}