package Collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by edara on 5/16/16.
 */
public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();
        Person p1 = new Person(10);
        Person p2 = new Person(20);
        Person p3 = new Person(18);
        Person p4 = new Person(15);
        people.add(p1);people.add(p2);people.add(p3);people.add(p4);
        for(Person p: people){
            System.out.println(p.getAge());
        }
    }

}
class Person implements Comparable<Person> {
    private int age;
    Person(int i){
        this.age = i;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.age > other.age ? 1 : this.age == other.age ? 0 : -1;
    }
}
