package com.certifications.ch3;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by edara on 4/29/16.
 */
public class LinkedHashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> nums = new LinkedHashMap<Integer,String>();
        nums.put(1,"one");
        nums.put(2,"two");nums.put(3,"three");nums.put(4,"four");nums.put(5,"five");

        for(int i:nums.keySet()){
            System.out.println(i+"->"+nums.get(i));
        }

    }
}
