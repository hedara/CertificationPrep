import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by edara on 3/19/16.
 */
public class Example1 {

    public static void main(String[] args) {
        float f = 19.0f;
        float f2 = (int) 102.9;
        float f4 = 1f*(short) 1.0;

        System.out.println("Hello ");
        String[] names = {"a","b","c","d"};
        printArray(names);
        List<String> ns = new ArrayList<>();
        ns.add("Hareen");ns.add("Edara");ns.add("Lakshmi"); ns.add("Chals");

        // can't cast List.
       // printList(ns);
       array2List();
        list2Array();

    }

    static void printArray(Object... varargs) {
        String[] tempArray = (String[]) varargs;
        for(String temp:tempArray){
            System.out.println(temp);
        }

    }
    static void printList(List<Object> args) {


    }

    static void array2List(){
        Integer[] nums = {1,2,3,4,5};
        List<Integer> numList = Arrays.asList(nums);
        nums[0] = 9;
        numList.set(1,9);

        System.out.println("array...");
        for(int i:nums) {
            System.out.println(i);
        }
        System.out.println("List.. ");
        for(Integer n:numList){
            System.out.println(n);
        }

    }

    static void list2Array(){
        Integer[] nums = {1,2,3,4,5};
        List<Integer> numList = Arrays.asList(nums);
        Integer[] numArray = numList.toArray(new Integer[0]);

        numList.set(1,9);

        System.out.println("array...");
        for(int i:numArray) {
            System.out.println(i);
        }
        System.out.println("List.. ");
        for(Integer n:numList){
            System.out.println(n);
        }
    }


}
