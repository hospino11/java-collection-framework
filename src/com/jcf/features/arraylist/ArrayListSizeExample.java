package com.jcf.features.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayListSizeExample {

    private static final Logger log = Logger.getLogger(ArrayListSizeExample.class.getName());

    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        log.log(Level.INFO, "Array size initializing the array with no elements: {0}. Elements are: {1}", new Object[] {ages.size(), ages});
        ages.add(1);
        ages.add(2);
        ages.add(3);
        ages.add(4);
        ages.add(5);
        log.log(Level.INFO, "Array size after adding 5 elements: {0}. Elements are: {1}", new Object[]{ages.size(), ages});
        ages.remove(3);
        ages.remove(Integer.valueOf(2));
        log.log(Level.INFO, "Array size after removing two elements (remove(3) and remove(new Integer(2))): {0}. Elements are: {1}", new Object[]{ages.size(), ages});
    }
}
