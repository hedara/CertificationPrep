package MethodParams;

/**
 * Created by edara on 4/29/16.
 */
public class Test2 extends Horse {
    public static void main(String[] args) {
        Test2 test = new Test2();
        Horse horse = new Test2();
        Animal animal = new Test2();
        test.method(test);
        test.method(horse);
        test.method(animal);
        test.method(null);
    }

    public void method(Animal a){

        System.out.println("inside animal arg method");
        if(a != null)
            a.print();
    }
    public void method(Horse h){
        System.out.println("inside horse arg method");
        if(h!=null)
            h.print();
    }

}

class Horse extends Animal {
    final static int val = 1;
    public void print(){
        System.out.println("Horse");
    }
}

class Animal {
    final static int val = 0;
    public void print() {
        System.out.println("Animal");
    }
}
