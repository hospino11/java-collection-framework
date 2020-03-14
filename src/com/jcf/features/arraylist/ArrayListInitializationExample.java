package com.jcf.features.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListInitializationExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Hansel", "Paola", "Onelia", "Ruben", "Jean", "Selideth"));
        System.out.println("Array initialized using Arrays.asList: " + names);
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
        System.out.println("Array initialized using inner class: " + cities);

        List<String> pets = new ArrayList<>();
        pets.add("Shere");
        pets.add("Nina");
        System.out.println("Array initialized using common way (add method): " + pets);

        List<String> defaultSpots = new ArrayList<>(Collections.nCopies(10, "Free"));
        System.out.println("Array initialized using Collections.nCopies: " + defaultSpots);
    }
}
