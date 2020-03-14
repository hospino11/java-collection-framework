package com.jcf.features.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayListSortExample {

    private static final Logger log = Logger.getLogger(ArrayListSortExample.class.getName());

    public static void main(String[] args) {
        List<String> countries = Arrays.asList("India", "USA", "China", "Denmark");
        log.log(Level.INFO, "Countries before sorting: {0}", countries);
        countries.sort(Comparator.naturalOrder());
        log.log(Level.INFO, "Countries sorted in natural order: {0}", countries);

        Collections.sort(countries, Comparator.reverseOrder());
        log.log(Level.INFO, "Countries sorted in reverse order: {0}", countries);

        List<Integer> hours = Arrays.asList(11, 2, 7, 3);
        log.log(Level.INFO, "Hours before sorting: {0}", hours);
        Collections.sort(hours);
        log.log(Level.INFO, "Hours after sorting: {0}", hours);
        Collections.reverse(hours);
        log.log(Level.INFO, "Hours after sorting in reverse order (Collections.reverse): {0}", hours);
        hours.sort(Collections.reverseOrder());
        log.log(Level.INFO, "Hours after sorting in reverse order (Collections.reverseOrder()): {0}", hours);

        List<String> names = Arrays.asList("AA", "ZZ", "CC", "FF");
        log.log(Level.INFO, "Names before sorting: {0}", names);
        names.sort(Collections.reverseOrder());
        log.log(Level.INFO, "Names after sorting (Collections.reverseOrder()): {0}", names);
    }
}
