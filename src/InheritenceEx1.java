import java.awt.geom.RoundRectangle2D;

/**
 * Created by edara on 4/3/16.
 */

// difference between overriding and overloading

public class InheritenceEx1 {
    public static void main(String[] args) {
        GameShape base = new GameShape();
        base.showShape();
        base = new RoundPieces();
        base.showShape();
        base = new SquarePieces();
        base.showShape();
        base.showShape("Triangle");

        SquarePieces square = new SquarePieces();
        square.move();

        square.showShape();

    }
}

class GameShape {
        void showShape(){
            System.out.println("No shape to display");
        }
        void showShape(String shape){
            System.out.println("Shape given: "+shape);
        }
}

class RoundPieces extends GameShape {
    // overriding base class.
    void showShape(){
        System.out.println("Round shape");
    }
    void move(){
        System.out.println("Move in circles");
    }
}

class SquarePieces extends GameShape {
    // overriding base class.
    void showShape(){
        System.out.println("Square shape");
    }
    void showShape(String shape){
        System.out.println("SquarePiece with top "+shape);
    }
    void move(){
        System.out.println("Move in Squares");
    }
}