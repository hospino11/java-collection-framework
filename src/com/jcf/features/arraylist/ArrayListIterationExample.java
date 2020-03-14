package com.jcf.features.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListIterationExample {

    public static void main(String[] args) {
        List<String> technologies = Arrays.asList("Java", "Spring", "AWS", "NodeJS");

        System.out.println("Iterating elements using for loop");
        for (int i = 0; i < technologies.size(); i++) {
            System.out.println(technologies.get(i));
        }

        System.out.println("Iterating elements using advances loop");
        for (String technology : technologies) {
            System.out.println(technology);
        }

        System.out.println("Iterating elements using while loop");
        int counter = 0;
        while (counter < technologies.size()) {
            System.out.println(technologies.get(counter));
            counter++;
        }

        System.out.println("Iterating elements using Iterator");
        Iterator<String> iterator = technologies.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Iterating elements using for iterator");
        iterator = technologies.iterator();
        for (;iterator.hasNext();) {
            String technology = iterator.next();
            System.out.println(technology);
        }

        System.out.println("Iterating elements using Enumeration");
        Enumeration<String> technologiesAsEnumeration = Collections.enumeration(technologies);
        while (technologiesAsEnumeration.hasMoreElements()) {
            System.out.println(technologiesAsEnumeration.nextElement());
        }

        System.out.println("Iterating elements using enumeration and for loop");
        for (Enumeration<String> e = Collections.enumeration(technologies); e.hasMoreElements();) {
            System.out.println(e.nextElement());
        }
    }
}
