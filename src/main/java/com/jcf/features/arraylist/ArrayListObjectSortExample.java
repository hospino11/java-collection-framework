package com.jcf.features.arraylist;

import com.jcf.features.arraylist.dto.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayListObjectSortExample {

    private static Logger log = Logger.getLogger("ArrayListObjectSortExample");

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Chaitanya", 223, 26));
        students.add(new Student("Rahul", 245, 24));
        students.add(new Student("Ajeet", 209, 32));
        log.log(Level.INFO, "Students list before any sort: {0}", students);

        Collections.sort(students);
        log.log(Level.INFO, "Students list after sort (implemented Comparable): {0}", students);
        students.sort(Student.StudentNameComparator);
        log.log(Level.INFO, "Students list after sort (implemented Comparator by name): {0}", students);
        Collections.sort(students, Student.StudentRollNoComparator);
        log.log(Level.INFO, "Students list after sort (implemented Comparator by rollNo): {0}", students);
        students.sort(Comparator.comparing(s -> s.getName().toLowerCase()));
        log.log(Level.INFO, "Students list after sort (Comparator.comparing by name): {0}", students);
        students.sort(Comparator.comparing(Student::getAge));
        log.log(Level.INFO, "Students list after sort (Comparator.comparing by age): {0}", students);
    }
}
