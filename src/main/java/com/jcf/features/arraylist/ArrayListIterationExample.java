package com.jcf.features.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class ArrayListIterationExample {

    private static final Logger log = Logger.getLogger(ArrayListIterationExample.class.getName());

    public static void main(String[] args) {
        List<String> technologies = Arrays.asList("Java", "Spring", "AWS", "NodeJS");

        log.info("Iterating elements using for loop");
        for (int i = 0; i < technologies.size(); i++) {
            log.info(technologies.get(i));
        }

        log.info("Iterating elements using advances loop");
        for (String technology : technologies) {
            log.info(technology);
        }

        log.info("Iterating elements using while loop");
        int counter = 0;
        while (counter < technologies.size()) {
            log.info(technologies.get(counter));
            counter++;
        }

        log.info("Iterating elements using Iterator");
        Iterator<String> iterator = technologies.iterator();
        while (iterator.hasNext()) {
            log.info(iterator.next());
        }

        log.info("Iterating elements using for iterator");
        iterator = technologies.iterator();
        for (;iterator.hasNext();) {
            String technology = iterator.next();
            log.info(technology);
        }

        log.info("Iterating elements using Enumeration");
        Enumeration<String> technologiesAsEnumeration = Collections.enumeration(technologies);
        while (technologiesAsEnumeration.hasMoreElements()) {
            log.info(technologiesAsEnumeration.nextElement());
        }

        log.info("Iterating elements using enumeration and for loop");
        for (Enumeration<String> e = Collections.enumeration(technologies); e.hasMoreElements();) {
            log.info(e.nextElement());
        }
    }
}
