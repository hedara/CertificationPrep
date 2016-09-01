import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by edara on 4/4/16.
 */
public class OverloadingEx1 {
    public static void main(String[] args) throws IOException {
        Animal a = new Animal();
        a.eat("hay");
        Animal a2 = new Horse();
        a2.eat();
    }

}

class Animal{
    void eat(String food){
        System.out.println("Animal eating "+food);
    }
    void eat() throws FileNotFoundException {
        System.out.println("Animal don't like this food");
    }

}
class Horse extends Animal {
    void eat() {
        System.out.println("Horse eating ");
    }
}