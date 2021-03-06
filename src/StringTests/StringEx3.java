package StringTests;

/**
 * Created by edara on 5/25/16.
 */

/**
    These are the six facts on Strings:
1. Literal strings within the same class in the same package represent references to the same String object.
2. Literal strings within different classes in the same package represent references to the same String object.
3. Literal strings within different classes in different packages likewise represent references to the same String object.
4. Strings computed by constant expressions are computed at compile time and then treated as if they were literals.
5. Strings computed at run time are newly created and therefore are distinct. (So line 4 prints false.)
6. The result of explicitly interning a computed string is the same string as any pre-existing literal string with the same contents. (So line 5 prints true.)

 **/
public class StringEx3 {
    public static void main(String[] args) {
        String name = "hareen";
        String part1 = "har";
        String part2 = "een";
        if(name == "har"+"een"){
            System.out.println("true");
        }else{
            System.out.println("false");
        }



    }
}
