/**
 * Created by edara on 4/5/16.
 */
public class ReturnTypesEx1 {

    public static void main(String[] args) {
        Vehicle vh = getVehicle();
        vh.drive();
        Car car = (Car) getVehicle();
        car.drive();
        Highlander hi = (Highlander) getVehicle();
        hi.drive();
    }

    static Vehicle getVehicle(){
        return new Highlander();
    }

}

interface Vehicle {
    String start();
    void drive();
    String stop();
}

abstract class Car implements Vehicle {
    public String start() {
        return "started";
    }
    public String stop() {
        return "stopped";
    }
}

class Camry extends Car {
    public void drive() {
        System.out.println("Driving eco");
    }
}

class Highlander extends Car {
    public void drive(){
        System.out.println("Driving sluggish");
    }
}