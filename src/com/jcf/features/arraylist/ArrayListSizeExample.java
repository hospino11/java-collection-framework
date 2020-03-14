package com.jcf.features.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSizeExample {

    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        System.out.println("Array size initializing the array with no elements: " + ages.size() + ". Elements are: " + ages);
        ages.add(1);
        ages.add(2);
        ages.add(3);
        ages.add(4);
        ages.add(5);
        System.out.println("Array size after adding 5 elements: " + ages.size() + ". Elements are: " + ages);
        ages.remove(3);
        ages.remove(new Integer(2));
        System.out.println("Array size after removing two elements (remove(3) and remove(new Integer(2))): " + ages.size() + ". Elements are: " + ages);
    }
}
