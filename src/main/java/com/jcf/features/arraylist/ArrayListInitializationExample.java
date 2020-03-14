package com.jcf.features.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class ArrayListInitializationExample {

    private static final Logger log = Logger.getLogger(ArrayListInitializationExample.class.getName());

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Hansel", "Paola", "Onelia", "Ruben", "Jean", "Selideth"));
        log.log(Level.INFO, "Array initialized using Arrays.asList: {0}", names);
        ArrayList<String> cities = new ArrayList<String>(){
            private boolean disable;

            public boolean checkDisable() {
                return disable && isEmpty();
            }

           {
                disable = true;
                add("Roma");
                add("London");
                add("Berlin");
                add("Madrid");
            }

            @Override
            public String toString() {
                String elements = "";
                for (int i = 0; i < this.toArray().length; i++) {
                    elements = elements.concat((String) this.toArray()[i]);
                    if (i < this.toArray().length - 1) {
                        elements = elements.concat(", ");
                    }
                }
                return "isDisabled? " + checkDisable() + " - " + elements;
            }
        };
        log.log(Level.INFO, "Array initialized using inner class: {0}", cities);

        List<String> pets = new ArrayList<>();
        pets.add("Shere");
        pets.add("Nina");
        log.log(Level.INFO, "Array initialized using common way (add method): {0}", pets);

        List<String> defaultSpots = new ArrayList<>(Collections.nCopies(10, "Free"));
        log.log(Level.INFO, "Array initialized using Collections.nCopies: {0}", defaultSpots);
    }
}
