package com.jcf.features.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayListAddExample {

    private static Logger log = Logger.getLogger("ArrayListAddExample");

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("CPS");
        names.add("John");
        names.add("Steve");
        log.log(Level.INFO, "Names list using add method: {0}", names);

        List<Integer> scores = new ArrayList<>();
        scores.add(1);
        scores.add(34);
        scores.add(99);
        scores.add(99);
        scores.add(78);
        log.log(Level.INFO, "Scores added by add method: {0}", scores);
    }
}
